package com.shw.netdisk.domain;

import org.bson.types.ObjectId;

/**
 * 资源
 * @author hu.sun
 *
 */
public class Resource extends BasicEntity{
	
	private ObjectId id;

	private String name;
	
	/**
	 * 类型Id
	 */
	private String typeId;
	
	private long userId;
	
	private String ext;
	
	private String description;
	
	private Long size;
	
	private String url;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
