package com.sap.runlet.expressionpad.launch;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;

import com.sap.runlet.abstractinterpreter.AbstractObjectFormatter;
import com.sap.runlet.abstractinterpreter.AbstractRunletInterpreter;
import com.sap.runlet.abstractinterpreter.DebugListener;
import com.sap.runlet.abstractinterpreter.StackFrame;
import com.sap.runlet.expressionpad.Activator;

public abstract class AbstractRunletThread extends DebugElement implements IThread {
    private final ILaunch launch;
    private final AbstractRunletInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> interpreter;
    private final AbstractObjectFormatter<?, ?, ?, ?> formatter;
    
    protected AbstractObjectFormatter<?, ?, ?, ?> getFormatter() {
        return formatter;
    }

    public AbstractRunletThread(AbstractRunletInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> interpreter,
	    ILaunch launch, RunletDebugTarget debugTarget,
	    AbstractObjectFormatter<?, ?, ?, ?> formatter) {
	super(debugTarget);
	this.interpreter = interpreter;
	this.launch = launch;
	this.formatter = formatter;
    }
    
    public int hashCode() {
	return getInterpreter().hashCode();
    }
    
    public boolean equals(Object o) {
	boolean result = false;
	if (o instanceof AbstractRunletThread) {
	    result = getInterpreter().equals(((AbstractRunletThread) o).getInterpreter());
	}
	return result;
    }

    @Override
    public IBreakpoint[] getBreakpoints() {
	// TODO Auto-generated method stub
	return new IBreakpoint[0];
    }

    @Override
    public String getName() {
	return toString();
    }

    @Override
    public int getPriority() {
	return 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public IStackFrame[] getStackFrames() {
	IStackFrame[] result;
	if (!isSuspended()) {
	    result = new IStackFrame[0];
	} else {
	    List<AbstractRunletStackFrame<?, ?, ?, ?>> runletStackFrames = new LinkedList<AbstractRunletStackFrame<?, ?, ?, ?>>();
	    Stack<StackFrame<?, ?, ?, ?>> stack = (Stack<StackFrame<?, ?, ?, ?>>) getInterpreter().getCallstack();
	    // frames on the interpreter stack can be nested; only add innermost frames
	    boolean innermost = true;
	    for (int i=stack.size()-1; i>=0; i--) {
		StackFrame<?, ?, ?, ?> frame = stack.get(i);
		if (innermost) {
		    runletStackFrames.add(createStackFrame(frame));
		}
		// the next frame is an innermost frame if it is not the current frame's scope parent
		innermost = frame.getScopeParent() == null; 
	    }
	    result = runletStackFrames.toArray(new IStackFrame[runletStackFrames.size()]);
	}
	return result;
    }

    @Override
    public IStackFrame getTopStackFrame() {
	if (getInterpreter().getCallstack().isEmpty()) {
	    return null;
	} else {
	    StackFrame<?, ?, ?, ?> frame = getInterpreter().getCallstack().peek();
	    IStackFrame result = null;
	    if (frame != null) {
		result = createStackFrame(frame);
	    }
	    return result;
	}
    }

    protected abstract RunletStackFrame createStackFrame(StackFrame<?, ?, ?, ?> frame);

    @Override
    public boolean hasStackFrames() {
	return !getInterpreter().getCallstack().isEmpty();
    }

    @Override
    public RunletDebugTarget getDebugTarget() {
	return (RunletDebugTarget) super.getDebugTarget();
    }

    @Override
    public ILaunch getLaunch() {
	return launch;
    }

    @Override
    public String getModelIdentifier() {
	return Activator.PLUGIN_ID;
    }

    @Override
    public boolean canResume() {
	return !isTerminated() && isSuspended();
    }

    @Override
    public boolean canSuspend() {
	return !isTerminated() && !isSuspended();
    }

    @Override
    public boolean isSuspended() {
	return getDebugTarget().getDebugSession().isSuspended(getInterpreter());
    }

    @Override
    public void resume() {
	getDebugTarget().getDebugSession().resume(getInterpreter(), DebugListener.ResumeReason.CLIENT_REQUEST);
    }

    @Override
    public void suspend() {
	getDebugTarget().getDebugSession().suspend(getInterpreter());
    }

    /**
     * Can step into if not suspended and at the bottom of the call hierarchy (top of the call stack)
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean canStepInto() {
	return isSuspended() && (
		getInterpreter().getCallstack().isEmpty() ||
		((AbstractRunletInterpreter<?, ?, ?, ?, ?, ?, ?, ?, StackFrame<?,?,?,?>, ?, ?>) getInterpreter()).oneDown(getInterpreter().getCallstack().peek()) == null);
    }

    @Override
    public boolean canStepOver() {
	return isSuspended();
    }

    @Override
    public boolean canStepReturn() {
	return isSuspended();
    }

    @Override
    public boolean isStepping() {
	return !isTerminated() && !isSuspended();
    }

    @Override
    public void stepInto() {
	getDebugTarget().getDebugSession().stepInto(getInterpreter());
    }

    @Override
    public void stepOver() {
	getDebugTarget().getDebugSession().stepOver(getInterpreter());
    }

    @Override
    public void stepReturn() {
	getDebugTarget().getDebugSession().stepReturn(getInterpreter());
    }

    @Override
    public boolean canTerminate() {
	return !isTerminated() && getLaunch().canTerminate();
    }

    @Override
    public boolean isTerminated() {
	return getInterpreter().isTerminated();
    }

    @Override
    public void terminate() {
	getInterpreter().terminate();
    }

    protected AbstractRunletInterpreter<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> getInterpreter() {
        return interpreter;
    }

}
