package com.dxe.weasel.api.service.test.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.dxe.weasel.api.service.test.ITestService;
import com.dxe.weasel.dal.test.model.TestModel;
import com.dxe.weasel.dal.test.repository.TestRepository;
/**
 * test
 *
 */
@Service
public class TestServiceImpl implements ITestService {
	private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	@Resource
	private TestRepository testRepository;
	
	public void save(String test1) throws Exception{
		TestModel test = new TestModel();
		test.setTest1(test1);
		testRepository.save(test);
	}
}
