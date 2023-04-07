//package com.example.incercam.Hibernate;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.persistence.Entity;
//import java.util.List;
//
//@Controller
//public class HibernateController {
//
//    @Autowired
//    PersonDao personDao;
//
//    @GetMapping("/selectHibernate")
//    @ResponseBody
//    public List<Person> selectPerson(){
//return personDao.selectPerson();
//    }
//
//    @GetMapping("/insertHibernate")
//    @ResponseBody
//    public String insertPerson(){
//        personDao.save("Popescu", "Antrei");
//        return "s-a facit";
//    }
//}
