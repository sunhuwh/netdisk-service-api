package com.shw.netdisk.domain;

/**
 * 资源类型
 * @author hu.sun
 *
 */
public class ResourceType extends BasicEntity{
	
	private Object id;
	
	private String name;
	
	private Long order;
	
	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}
	
}
