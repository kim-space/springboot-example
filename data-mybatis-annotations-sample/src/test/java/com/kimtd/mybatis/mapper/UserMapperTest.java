package com.kimtd.mybatis.mapper;

import com.kimtd.mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findByName() throws Exception {
        User u = userMapper.findByName("GGG");
        Assert.assertEquals(20, u.getAge().intValue());
    }

    @Test
//    @Rollback
    public void insert() throws Exception {
        userMapper.insert("GGG", 20);
    }

}