package com.kimtd.druid.repository;

import com.kimtd.druid.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserRepository(){
        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));
        userRepository.save(new User("fff", 60));
        userRepository.save(new User("ggg", 70));
        userRepository.save(new User("hhh", 80));
        userRepository.save(new User("iii", 90));
        userRepository.save(new User("jjj", 100));
        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepository.findAll().size());
        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findByName("fff").getAge().longValue());
        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepository.findUser("fff").getAge().longValue());
        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("fff", userRepository.findByNameAndAge("fff", 60).getName());
        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("aaa"));
        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepository.findAll().size());
    }


    @Test
    public void findByName() throws Exception {
    }

    @Test
    public void findByNameAndAge() throws Exception {
    }

    @Test
    public void findUser() throws Exception {
    }

}