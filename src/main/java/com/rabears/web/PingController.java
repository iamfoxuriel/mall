package com.rabears.web;

import com.rabears.dao.PersonRepository;
import com.rabears.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PingController {

    @Autowired
    PersonRepository repository;

    @RequestMapping("/ping")
    @ResponseBody
    public Iterable<Person> ping(){
        return repository.findAll();
    }
}
