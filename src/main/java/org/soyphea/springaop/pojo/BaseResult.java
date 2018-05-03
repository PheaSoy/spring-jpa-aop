package org.soyphea.springaop.pojo;

public class BaseResult {
	boolean status;
	String msg;
	public BaseResult(boolean status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
