package com.openshift.express.internal.client.response.unmarshalling.dto;

import java.util.List;

public class Operation {

	private final String rel;
	private final String href;
	private final String httpMethod;
	private final List<OperationParam> requiredParams;
	private final List<OperationParam> optionalParams;
	
	public Operation(final String rel, final String href, final String httpMethod,
			final List<OperationParam> requiredParams,
			final List<OperationParam> optionalParams) {
		this.rel = rel;
		this.href = href;
		this.httpMethod = httpMethod;
		this.requiredParams = requiredParams;
		this.optionalParams = optionalParams;
	}

	/**
	 * @return the rel
	 */
	protected final String getRel() {
		return rel;
	}

	/**
	 * @return the href
	 */
	protected final String getHref() {
		return href;
	}

	/**
	 * @return the httpMethod
	 */
	protected final String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * @return the requiredParams
	 */
	protected final List<OperationParam> getRequiredParams() {
		return requiredParams;
	}

	/**
	 * @return the optionalParams
	 */
	protected final List<OperationParam> getOptionalParams() {
		return optionalParams;
	}

}