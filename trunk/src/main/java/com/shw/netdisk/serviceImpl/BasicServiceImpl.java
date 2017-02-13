package com.shw.netdisk.serviceImpl;

public abstract class BasicServiceImpl {
	
	protected int getPage(long offset, int limit, long count) {
		if(count == 0){
			return 0;
		}
		Number totalPage = count % limit == 0 ? count/limit -1 : count/limit;
		return totalPage.intValue();
	}
	
}
