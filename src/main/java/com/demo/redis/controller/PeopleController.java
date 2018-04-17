package com.demo.redis.controller;

import com.demo.redis.entity.People;
import com.demo.redis.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/list2")
    public List<People> persionList2(){

        List<People> res = peopleService.queryPeopleInfo();

        return res;
    }

    @RequestMapping("query")
    public People queryOne(){
        return peopleService.queryById(21);
    }

    @RequestMapping("/add")
    public People addPeople(){
        People p = new People();
        p.setId(21);
        p.setName("...");
        p.setSex(0);

        peopleService.save(p);

        return peopleService.queryById(21);
    }

    @RequestMapping("/update")
    public People updatePeople(){
        People p = new People();
        p.setId(21);
        p.setName("xxx");
        p.setSex(0);

        peopleService.save(p);

        return peopleService.queryById(21);
    }
}
