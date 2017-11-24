package com.kimtd.mapper;

import com.kimtd.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;


    @Test
    public void add(){
        Student student = new Student();
        student.setAge(22);
        student.setAvgScore("99");
        student.setName("xxx");
        student.setSumScore("100");
        studentMapper.insert(student);
    }

    @Test
    public void likeName() throws Exception {
        List<Student> kim = studentMapper.likeName("kim");
        System.out.println(kim.size());
    }

    @Test
    public void getById() throws Exception {
        Student byId = studentMapper.getById(0);
        System.out.println(byId);
    }

    @Test
    public void getNameById() throws Exception {
    }

}