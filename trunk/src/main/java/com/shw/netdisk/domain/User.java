package com.shw.netdisk.domain;

/**
 * 用户
 * @author hu.sun
 *
 */
public class User extends BasicEntity {
	
	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
