package com.kimtd.mybatis.mapper;

import com.github.pagehelper.Page;
import com.kimtd.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    User findByName(String name);

    int insert(User user);

    void update(User user);

    void delete(Long id);

    List<User> findAll();
}
