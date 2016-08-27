package com.dxe.weasel.common.enums;

import java.util.ArrayList;
import java.util.List;


public enum CodeEnum {
	SUCCESS("0000","操作成功"),
	//公共错误信息
	SYSTEM_ERROR("0001","系统错误"),
	PATTERN_ERROR("0002", "入参格式错误"),
	BUSSINESS_VAL_ERROR("0003", "业务校验错"),
	PAYMENT_ORDID_MORE("0004","重复提交");
	/** 枚举值 */
	private final String	code;
	
	/** 枚举描述 */
	private final String	message;
	
	/**
	 * 构造一个<code>DomainResultCodeEnum</code>枚举对象
	 *
	 * @param code
	 * @param message
	 */
	private CodeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 *
	 * @param code
	 * @return DomainResultCodeEnum
	 */
	public static CodeEnum getByCode(String code) {
		for (CodeEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<DomainResultCodeEnum>
	 */
	public List<CodeEnum> getAllEnum() {
		List<CodeEnum> list = new ArrayList<CodeEnum>();
		for (CodeEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (CodeEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}

