package com.demo.redis.service;

import com.demo.redis.dao.PeopleJPA;
import com.demo.redis.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private PeopleJPA peopleJPA;

    public List<People> queryPeopleInfo(){
        return peopleJPA.findAll();
    }

    public People queryById(Integer id){
        return peopleJPA.findById(id);
    }

    public void save(People p){
        peopleJPA.save(p);
    }

}
