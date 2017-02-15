package com.shw.netdisk.entity.result;

import org.springframework.http.HttpStatus;

public class ApiResult {
	
	public ApiResult(HttpStatus code, HttpMessage message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public ApiResult(HttpStatus code, Object data) {
		this.code = code;
		this.data = data;
	}
	
	private HttpStatus code;
	
	private HttpMessage message;
	
	private Object data;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}

	public HttpMessage getMessage() {
		return message;
	}

	public void setMessage(HttpMessage message) {
		this.message = message;
	}
	
}
