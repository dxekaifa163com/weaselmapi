package com.dxe.weasel.dal.test.repository;

import org.springframework.stereotype.Repository;

import com.dxe.weasel.dal.base.BaseRepository;
import com.dxe.weasel.dal.test.model.TestModel;
@Repository
public interface TestRepository extends BaseRepository<TestModel, Integer>{

		
}
