package com.bat.sbdemo.utils;

public enum ResultCode {
	SUCCESS(0, "操作成功"), EXCEPTION(1, "操作失败"), ERROR(-1, "未知异常，请联系管理员！"),

	;

	private int retCode;
	private String message;

	private ResultCode(int retCode, String message) {
		this.retCode = retCode;
		this.message = message;
	}

	public int getRetCode() {
		return retCode;
	}

	public String getMessage() {
		return message;
	}
}
