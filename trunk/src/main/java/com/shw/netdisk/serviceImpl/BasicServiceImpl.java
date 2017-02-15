package com.shw.netdisk.serviceImpl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public abstract class BasicServiceImpl {
	
	protected Pageable createPageable(long offset, int limit, long count) {
		int page = getPage(offset, limit, count);
		Pageable pageable = new PageRequest(page, limit);
		return pageable;
	}
	
	private int getPage(long offset, int limit, long count) {
		if(count == 0){
			return 0;
		}
		Number totalPage = count % limit == 0 ? count/limit -1 : count/limit;
		return totalPage.intValue();
	}
	
}
