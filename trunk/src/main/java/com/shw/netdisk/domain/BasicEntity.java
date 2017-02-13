package com.shw.netdisk.domain;

public class BasicEntity {

	private long createAt;

	private long updateAt;

	public long getCreateAt() {
		return createAt;
	}

	public void setCreateAt(long createAt) {
		this.createAt = System.currentTimeMillis();
	}

	public long getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
}
