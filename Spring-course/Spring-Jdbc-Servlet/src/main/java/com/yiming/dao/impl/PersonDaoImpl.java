package com.yiming.dao.impl;

import com.yiming.dao.PersonDao;
import com.yiming.entity.Person;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    private JdbcTemplate jdbcTemplate;



    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void savePerson(Person person) {

        Object[] args = {person.getName(), person.getGender(), person.getAge(), person.getBirthday()};
        jdbcTemplate.update("insert into person(name,gender,age,birthday) values(?,?,?,?)", args);
    }

    @Override
    public void updatePerson(Person person) {
        String sql = "update person set name=? , gender=?,age=?,birthday=? where id=?";
        Object[] args = {person.getName(), person.getGender(), person.getAge(), person.getBirthday(), person.getId()};
        jdbcTemplate.update(sql, args);
    }

    @Override
    public void deletePerson(Integer id) {
        String sql = "delete from person where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Person getPersonById(Integer id) {
        String sql = "select * from person where id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Person>() {
                @Override
                public Person mapRow(ResultSet resultSet, int i) throws SQLException {

                    Person person = new Person(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("gender"),
                            resultSet.getInt("age"),
                            resultSet.getDate("birthday"));
                    return person;
                }
            });
        }catch (EmptyResultDataAccessException e){
            System.out.println("没有找到结果");
        }
        return null;

    }

    @Override
    public List<Person> getPersons() {
        String sql = "select * from person ";
        return jdbcTemplate.query(sql, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Person(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("gender"),
                        resultSet.getInt("age"),
                        resultSet.getDate("birthday"));
            }
        });
    }
}
