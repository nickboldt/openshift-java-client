/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.client;

/**
 * Enum to indicate the support for scalability when creating a new application
 * @author Xavier Coulon
 *
 */
public enum EnumApplicationScale {
	
	SCALE("true"), NO_SCALE("false"), DEFAULT("false");
	
	private final String value;
	private EnumApplicationScale(final String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

}
