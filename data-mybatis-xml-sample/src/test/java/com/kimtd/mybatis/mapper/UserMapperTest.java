package com.kimtd.mybatis.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kimtd.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findByName() throws Exception {
        User hhh = userMapper.findByName("HHH");
        System.out.println(hhh);
    }

    @Test
    public void insert() throws Exception {
        User hhh = new User("HHH", 22);
        int insert = userMapper.insert(hhh);
        System.out.println(insert);
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }


    @Test
    public void findAll(){
        PageHelper.startPage(1,3);
        List<User> all = userMapper.findAll();
        PageInfo info = new PageInfo(all);
        System.out.println(info);
    }
}