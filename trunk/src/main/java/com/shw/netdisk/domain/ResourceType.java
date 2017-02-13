package com.shw.netdisk.domain;

/**
 * 资源类型
 * @author hu.sun
 *
 */
public class ResourceType extends BasicEntity{
	
	private int id;
	
	private String name;
	
	private int order;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
}
