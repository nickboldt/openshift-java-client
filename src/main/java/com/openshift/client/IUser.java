/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.client;

import java.net.SocketTimeoutException;
import java.util.List;


/**
 * @author André Dietisheim
 */
public interface IUser {

	public String getRhlogin();

	public String getPassword();
	
	public String getAuthKey();
	
	public String getAuthIV();

	public boolean isValid() throws OpenShiftException;

	public String getUUID() throws OpenShiftException;

	public IDomain createDomain(String name) throws OpenShiftException, SocketTimeoutException;

	public IDomain createDomain(String name, ISSHPublicKey key) throws OpenShiftException;

	public List<IDomain> getDomains() throws OpenShiftException, SocketTimeoutException;
	
	public IDomain getDomain(String namespace) throws OpenShiftException, SocketTimeoutException;
	
	public boolean hasDomain() throws OpenShiftException;

	public List<ISSHPublicKey> getSshKeys() throws OpenShiftException;

	public void addSshKey(ISSHPublicKey key) throws OpenShiftException;

	public List<ICartridge> getCartridges() throws OpenShiftException;

	public List<IEmbeddableCartridge> getEmbeddableCartridges() throws OpenShiftException;

	public ICartridge getCartridgeByName(String name) throws OpenShiftException;

	public void refresh() throws OpenShiftException;

}