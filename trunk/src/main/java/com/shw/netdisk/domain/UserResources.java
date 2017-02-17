package com.shw.netdisk.domain;

/**
 *	用户的资源
 * @author hu.sun
 *
 */
public class UserResources {
	
	private String id;
	
	private String userId;
	
	private String[] resourceIds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String[] getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(String[] resourceIds) {
		this.resourceIds = resourceIds;
	}
	
}
