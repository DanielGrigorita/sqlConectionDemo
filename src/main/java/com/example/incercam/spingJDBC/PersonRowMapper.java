package com.example.incercam.spingJDBC;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person p = new Person();
        p.setId(rs.getInt("idPerson"));
        p.setNume(rs.getString("Nume"));
        p.setPrenume(rs.getString("Prenume"));
        return p;
    }
}
