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
package com.openshift.express.internal.client.response.unmarshalling.dto;

import java.util.Map;

/**
 * The Class KeyResourceDTO.
 */
public class KeyResourceDTO extends BaseResourceDTO {

	
	/** The name. */
	private final String name;

	/** The type. */
	private final String type;
	
	/** The content. */
	private final String content;
	
	/**
	 * Instantiates a new key resource dto.
	 *
	 * @param name the name
	 * @param type the type
	 * @param content the content
	 * @param links the links
	 */
	public KeyResourceDTO(final String name, final String type, final String content, final Map<String, Link> links) {
		super(links);
		this.name = name;
		this.type = type;
		this.content = content;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public final String getType() {
		return type;
	}
	
	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public final String getContent() {
		return content;
	}
	
}
