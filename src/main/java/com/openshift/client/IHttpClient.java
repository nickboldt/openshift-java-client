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

import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;

import com.openshift.internal.client.httpclient.HttpClientException;

/**
 * @author André Dietisheim
 */
public interface IHttpClient {

	public static final int STATUS_OK = 200;
	public static final int STATUS_INTERNAL_SERVER_ERROR = 200;
	public static final int STATUS_BAD_REQUEST = 400;
	public static final int STATUS_UNAUTHORIZED = 401;
	public static final int STATUS_NOT_FOUND = 404;

	public static final char SPACE = ' ';
	public static final char COLON = ':';
	public static final char AMPERSAND = '&';
	public static final char EQUALS = '=';
	
	public static final String USER_AGENT = "User-Agent"; //$NON-NLS-1$

	public void setUserAgent(String userAgent);
	
	public String get(URL url) throws HttpClientException, SocketTimeoutException;

	public String post(Map<String, Object> parameters, URL url) throws HttpClientException, SocketTimeoutException, UnsupportedEncodingException;

	public String put(Map<String, Object> parameters, URL url) throws HttpClientException, SocketTimeoutException, UnsupportedEncodingException;

	public String delete(URL url) throws HttpClientException, SocketTimeoutException;
}