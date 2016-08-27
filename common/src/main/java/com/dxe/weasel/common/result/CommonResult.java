package com.dxe.weasel.common.result;


import com.dxe.weasel.common.enums.CodeEnum;
/**
 * 公共结果
 */
public class CommonResult {
	private String code = CodeEnum.SUCCESS.getCode();
	private String message =  CodeEnum.SUCCESS.getMessage();
	private Object data;

	public CommonResult() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}