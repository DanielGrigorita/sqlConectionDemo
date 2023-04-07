package com.example.incercam.spingJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpingJDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/selectSpringJdbc")
    @ResponseBody
    public List<Person> getPerson(){
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    @GetMapping("/insertNewPerson")
    @ResponseBody
    public String insertNewPerson(){
        jdbcTemplate.update("insert into person value(null, ?, ?)", "Victor", "Popescu" );
        return "S-a inserat";

    }
}
