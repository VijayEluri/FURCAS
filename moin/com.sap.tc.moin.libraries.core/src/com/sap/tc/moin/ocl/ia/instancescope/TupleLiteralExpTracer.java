package com.sap.tc.moin.ocl.ia.instancescope;

import org.omg.ocl.expressions.__impl.TupleLiteralExpImpl;

import com.sap.tc.moin.repository.core.CoreConnection;

public class TupleLiteralExpTracer extends AbstractTracer<TupleLiteralExpImpl> {
    public TupleLiteralExpTracer(CoreConnection conn, TupleLiteralExpImpl expression) {
	super(conn, expression);
    }

}