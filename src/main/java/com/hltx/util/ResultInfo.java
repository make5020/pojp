package com.hltx.util;

public class ResultInfo {

	public static final String SUCCESS = "1";
	public static final String ERROR = "0";
	
	private String state;
	private String code;
	private String Message;
	
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
}
