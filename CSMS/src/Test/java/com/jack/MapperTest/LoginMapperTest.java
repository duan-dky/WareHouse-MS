package com.jack.MapperTest;

import com.jack.Mapper.LoginMapper;
import com.jack.Pojo.LoginUser;
import com.jack.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class LoginMapperTest {
    @Autowired
    private LoginMapper loginMapper;

    @Test
    public void selectAll(){
        List<LoginUser> users = loginMapper.selectAll();
        System.out.println(users);
    }

    @Test
    public void findUser(){
        LoginUser user = loginMapper.findUser("admin");
        System.out.println(user);
    }

    @Test
    public void  updateById(){
        LoginUser user=new LoginUser("admin","admin1","12345@qq.com",0);
        int i = loginMapper.updateById(user, "admin");
        System.out.println(i);
    }
    @Test
    public void addUser(){
        LoginUser user=new LoginUser("123","admin1","12345@qq.com",0);
        int i = loginMapper.addUser(user);
        System.out.println(i);
    }

    @Test
    public void deleteById(){
        int i = loginMapper.deleteById("123");
        System.out.println(i);
    }
}
