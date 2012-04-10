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
package com.openshift.internal.client.response.unmarshalling.dto;

import java.util.HashMap;

public class GearsComponent extends BaseResourceDTO {

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((internalPort == null) ? 0 : internalPort.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((proxyHost == null) ? 0 : proxyHost.hashCode());
		result = prime * result + ((proxyPort == null) ? 0 : proxyPort.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		GearsComponent other = (GearsComponent) obj;
		if (internalPort == null) {
			if (other.internalPort != null) {
				return false;
			}
		} else if (!internalPort.equals(other.internalPort)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (proxyHost == null) {
			if (other.proxyHost != null) {
				return false;
			}
		} else if (!proxyHost.equals(other.proxyHost)) {
			return false;
		}
		if (proxyPort == null) {
			if (other.proxyPort != null) {
				return false;
			}
		} else if (!proxyPort.equals(other.proxyPort)) {
			return false;
		}
		return true;
	}

	/** the component name. */
	private final String name;
	
	/** the component internal port. */
	private final String internalPort;
	
	/** the component proxy host. */
	private final String proxyHost;
	
	/** the component proxy port. */
	private final String proxyPort;

	/**
	 * Instantiates a new gear component dto.
	 *
	 * @param name the name
	 * @param internalPort the internal port
	 * @param proxyPort the proxy port
	 * @param proxyHost the proxy host
	 */
	public GearsComponent(final String name, final String internalPort, final String proxyHost, final String proxyPort) {
		super(new HashMap<String, Link>());
		this.name = name;
		this.internalPort = internalPort;
		this.proxyHost = proxyHost;
		this.proxyPort = proxyPort;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GearsComponent [name=" + name + ", internalPort=" + internalPort + ", proxyHost=" + proxyHost
				+ ", proxyPort=" + proxyPort + "]";
	}

	/**
	 * @return the name
	 */
	protected final String getName() {
		return name;
	}

	/**
	 * @return the internalPort
	 */
	protected final String getInternalPort() {
		return internalPort;
	}

	/**
	 * @return the proxyHost
	 */
	protected final String getProxyHost() {
		return proxyHost;
	}

	/**
	 * @return the proxyPort
	 */
	protected final String getProxyPort() {
		return proxyPort;
	}
}