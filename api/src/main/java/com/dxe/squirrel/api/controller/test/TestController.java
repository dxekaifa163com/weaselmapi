package com.dxe.squirrel.api.controller.test;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxe.squirrel.api.service.test.ITestService;
import com.dxe.squirrel.common.enums.CodeEnum;
import com.dxe.squirrel.common.result.CommonResult;
@Controller
@RequestMapping("/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	@Resource
	private ITestService iTestService;
	
	/**
	 * test
	 * @return
	 */
	@ResponseBody
    @RequestMapping(value = "/test", method = {RequestMethod.POST})
	public CommonResult test(String test1) {
		CommonResult result = new CommonResult();
		try {
			iTestService.save(test1);
		} catch (Exception e) {
			logger.error("test系统异常",e);
			result.setCode(CodeEnum.SYSTEM_ERROR.getCode());
			result.setMessage(CodeEnum.SYSTEM_ERROR.getMessage());
		}
		return result;
	}
	
	
}
