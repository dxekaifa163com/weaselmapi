package com.dxe.weasel.dal.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dxe.weasel.dal.base.impl.BaseRepositoryImpl;

@Configuration
@EntityScan("com.dxe.weasel.dal")
@EnableJpaRepositories(basePackages = {"com.dxe.weasel.dal"}, repositoryBaseClass = BaseRepositoryImpl.class)
public class JpaConfig {

}
