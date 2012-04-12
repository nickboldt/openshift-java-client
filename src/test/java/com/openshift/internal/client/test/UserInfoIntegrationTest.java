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

import com.openshift.client.NotFoundOpenShiftException;
import com.openshift.client.OpenShiftException;
import com.openshift.internal.client.User;

/**
 * @author André Dietisheim
 */
public class UserInfoIntegrationTest {

//	private IOpenShiftService service;
//	private TestUser user;

	@Before
	public void setUp() throws OpenShiftException, IOException {
//		service = new OpenShiftService(TestUser.ID, new OpenShiftConfiguration().getLibraServer());
//		service.setEnableSSLCertChecks(Boolean.parseBoolean(System.getProperty("enableSSLCertChecks")));
//		
//		user = new TestUser(service);
	}

	@Test
	public void canGetUserInfo() throws Exception {
//		UserInfo userInfo = service.getUserInfo(user);
//		assertNotNull(userInfo);
//
//		assertEquals(user.getRhlogin(), userInfo.getRhLogin());
	}

	//@Test(expected = InvalidCredentialsOpenShiftException.class)
	public void getUserInfoForInexistantUserThrowsException() throws Exception {
//		TestUser inexistantUser = new TestUser("inexistantUsername", "bogusPassword", service);
//		service.getUserInfo(inexistantUser);
	}

	/**
	 * {@link service#getUserInfo(User)} for a user without
	 * domain throws {@link NotFoundOpenShiftException}
	 */
//	@Test(expected = NotFoundOpenShiftException.class)
//	public void canGetUserInfoForUserWithoutDomain() throws Exception {
//		TestUser inexistantUser = new TestUser(TestUser.RHLOGIN_USER_WITHOUT_DOMAIN, TestUser.PASSWORD_USER_WITHOUT_DOMAIN, service);
//		service.getUserInfo(inexistantUser);
//	}

	@Test
	public void userInfoContainsOneMoreApplicationAfterCreatingNewApplication() throws Exception {
//		UserInfo userInfo = service.getUserInfo(user);
//		assertNotNull(userInfo);
//
//		List<ApplicationInfo> applicationInfos = userInfo.getApplicationInfos();
//		assertNotNull(applicationInfos);
//		int numberOfApplicationInfos = applicationInfos.size();
//
//		String applicationName = createRandomName();
//		try {
//			service.createApplication(applicationName, ICartridge.JBOSSAS_7, user);
//
//			UserInfo userInfo2 = service.getUserInfo(user);
//			assertEquals(numberOfApplicationInfos + 1, userInfo2.getApplicationInfos().size());
//			ApplicationInfoAsserts.assertThatContainsApplicationInfo(applicationName, userInfo2.getApplicationInfos());
//		} finally {
//			ApplicationUtils.silentlyDestroyApplication(applicationName, ICartridge.JBOSSAS_7, user, service);
//		}
	}

	@Test
	public void canUseReturnedSSHKeyToChangeDomain() throws Exception {
//		UserInfo userInfo = service.getUserInfo(user);
//		assertNotNull(userInfo);
//
//		ISSHPublicKey sshKey = userInfo.getSshPublicKey();
//		service.changeDomain(createRandomName(), sshKey, user);
	}

	private String createRandomName() {
		return String.valueOf(System.currentTimeMillis());
	}
}
