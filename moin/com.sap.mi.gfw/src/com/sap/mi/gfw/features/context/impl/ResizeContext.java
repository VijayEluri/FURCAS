/*
 * Created on 20.06.2005
 */
package com.sap.mi.gfw.features.context.impl;

import com.sap.mi.gfw.features.context.IResizeContext;
import com.sap.mi.gfw.features.context.impl.base.DefaultContext;

/**
 * The Class ResizeContext.
 */
public class ResizeContext extends DefaultContext implements IResizeContext {

	private int height = -1;

	private int width = -1;

	/**
	 * Instantiates a new resize context.
	 */
	public ResizeContext() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.gfw.features.IContext#getHeight()
	 */
	public int getHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.gfw.features.IContext#getWidth()
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the height.
	 * 
	 * @param height
	 *            The height to set.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Sets the size.
	 * 
	 * @param width
	 *            the width
	 * @param height
	 *            the height
	 */
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Sets the width.
	 * 
	 * @param width
	 *            The width to set.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sap.mi.gfw.features.context.impl.base.DefaultContext#toString()
	 */
	@Override
	public String toString() {
		String ret = super.toString();
		ret = ret + "(width=" + getWidth() + ", height=" + getHeight() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return ret;
	}
}