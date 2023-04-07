package com.example.incercam.PringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpringDataJPa {

    @Autowired
    PersonJpaDao personDao;

    @GetMapping("/selectJPA")
    @ResponseBody
    public List<Person> selectPerson(){
return (List<Person>) personDao.findAll();
    }

    @GetMapping("/insertJPA")
    @ResponseBody
    public String insertPerson(){
        Person p = new Person();
        p.setPrenume("Micu");
        p.setNume("Mare");
        personDao.save(p);
        return "s-a facit";
    }
}
