/******************************************************************************* 
 * Copyright (c) 2007 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.internal.client.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.openshift.client.IOpenShiftService;
import com.openshift.client.IUser;
import com.openshift.client.OpenShiftException;

/**
 * @author André Dietisheim
 */
public class ApplicationLogReaderIntegrationTest {

	private static final int LOGREADER_TIMEOUT = 10 * 1024;
	private IOpenShiftService service;
	private IUser user;

	@Before
	public void setUp() throws OpenShiftException, IOException {
//		service = new OpenShiftService(TestUser.ID, new OpenShiftConfiguration().getLibraServer());
//		service.setEnableSSLCertChecks(Boolean.parseBoolean(System.getProperty("enableSSLCertChecks")));
//		
//		user = new TestUser(service);
	}

	/**
	 * Asserts the service implementation: getStatus returns the same log if no
	 * new log entry is available
	 * 
	 * @throws Exception
	 */
	@Test
	public void getStatusReturnsTheWholeLogIfNoNewLogEntryOnServer() throws Exception {
//		String applicationName = ApplicationUtils.createRandomApplicationName();
//		try {
//			IApplication application = service.createApplication(applicationName, ICartridge.JBOSSAS_7, user);
//			String applicationStatus = service.getStatus(application.getName(), application.getCartridge(), user);
//			String applicationStatus2 = service.getStatus(application.getName(), application.getCartridge(), user);
//			assertEquals(applicationStatus, applicationStatus2);
//		} finally {
//			ApplicationUtils.silentlyDestroyAS7Application(applicationName, user, service);
//		}
	}

	/**
	 * Asserts the service implementation: getStatus returns the new entries
	 * (and a tailing-header) if new log entries are available
	 */
	@Test
	public void getStatusReturnsNewEntriesIfNewLogEntriesOnServer() throws Exception {
//		String applicationName = ApplicationUtils.createRandomApplicationName();
//		try {
//			IApplication application = service.createApplication(applicationName, ICartridge.JBOSSAS_7, user);
//			String applicationStatus = service.getStatus(application.getName(), application.getCartridge(), user);
//			application.restart();
//			String applicationStatus2 = service.getStatus(application.getName(), application.getCartridge(), user);
//			assertFalse(applicationStatus.equals(applicationStatus2));
//		} finally {
//			ApplicationUtils.silentlyDestroyAS7Application(applicationName, user, service);
//		}
	}

	@Test
	public void logReaderReturnsNewEntriesAfterApplicationRestart() throws Exception {
//		IApplication application = null;
//		ExecutorService executor = null;
//		try {
//			application = user.createTestApplication();
//			ApplicationLogReader logReader = application.getLogReader();
//			LogReaderRunnable logReaderRunnable = new LogReaderRunnable(logReader, LOGREADER_TIMEOUT);
//			executor = Executors.newSingleThreadExecutor();
//			executor.submit(logReaderRunnable);
//
//			String log = logReaderRunnable.waitUntilNoNewLogentries();
//			assertNotNull(log);
//			assertTrue(log.length() > 0);
//			
//			application.restart();
//
//			String newLog = logReaderRunnable.waitUntilNoNewLogentries();
//			assertNotNull(newLog);
//			assertTrue(newLog.length() > 0);
//			assertFalse(log.equals(newLog));
//		} finally {
//			if (executor != null) {
//				executor.shutdownNow();
//			}
//			if (application != null) {
//				user.silentlyDestroyApplication(application);
//			}
//		}
	}
}
