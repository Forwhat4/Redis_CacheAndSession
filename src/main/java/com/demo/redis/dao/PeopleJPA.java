package com.demo.redis.dao;

import com.demo.redis.entity.People;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

@CacheConfig(cacheNames = "people")
public interface PeopleJPA extends JpaRepository<People,Long>,JpaSpecificationExecutor<People>,Serializable {

    @CachePut(key = "#p0.id")
    @Override
    public People save(People p);

    @Cacheable(key = "#p0")
    public People findById(Integer id);

}
