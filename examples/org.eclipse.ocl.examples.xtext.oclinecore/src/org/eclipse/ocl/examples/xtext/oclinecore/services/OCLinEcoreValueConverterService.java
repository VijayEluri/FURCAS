/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLinEcoreValueConverterService.java,v 1.2 2010/05/03 05:44:44 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.services;

import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLValueConverterService;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

public class OCLinEcoreValueConverterService extends EssentialOCLValueConverterService
{
	@ValueConverter(rule = "LOWER")
	public IValueConverter<Integer> LOWER() {
		return new AbstractNullSafeConverter<Integer>() {
			
			@Override
			public Integer internalToValue(String string, AbstractNode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert empty string to integer", node, null);
				try {
					return Integer.valueOf(string);
				} catch (NumberFormatException e) {
					throw new ValueConverterException("Couldn't convert '"+string+"' to integer", node, e);
				}
			}

			@Override
			public String internalToString(Integer value) {
				return value.toString();
			}

		};
	}

	@ValueConverter(rule = "UNQUOTED_STRING")
	public IValueConverter<String> UNQUOTED_STRING() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, AbstractNode node) {
				try {
					return Strings.convertFromJavaString(string.substring(1, string.length() - 1), false);
				} catch(IllegalArgumentException e) {
					throw new ValueConverterException(e.getMessage(), node, e);
				}
			}

			@Override
			protected String internalToString(String value) {
				return value; //Strings.convertToJavaString(value.replace('\r', '\n'), false);
			}
		};
	}
	
	@ValueConverter(rule = "UPPER")
	public IValueConverter<Integer> UPPER() {
		return new AbstractNullSafeConverter<Integer>() {
			
			@Override
			public Integer internalToValue(String string, AbstractNode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert empty string to integer", node, null);
				try {
					if ("*".equals(string)) {
						return Integer.valueOf(-1);
					}
					return Integer.valueOf(string);
				} catch (NumberFormatException e) {
					throw new ValueConverterException("Couldn't convert '"+string+"' to integer", node, e);
				}
			}

			@Override
			public String internalToString(Integer value) {
				return value >= 0 ? value.toString() : "*";
			}

		};
	}
}