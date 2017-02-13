package com.shw.netdisk.entity.result;

import java.util.Map;

import org.springframework.http.HttpStatus;

public class ApiResult {
	
	public ApiResult(HttpStatus code, HttpMessage message, Map data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public ApiResult(HttpStatus code, Map data) {
		this.code = code;
		this.data = data;
	}
	
	private HttpStatus code;
	
	private HttpMessage message;
	
	private Map data;
	
	public Map getData() {
		return data;
	}

	public void setData(Map data) {
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
