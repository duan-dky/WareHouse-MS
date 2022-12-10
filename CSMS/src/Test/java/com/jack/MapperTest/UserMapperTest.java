package com.jack.MapperTest;

import com.jack.Mapper.UserMapper;
import com.jack.Pojo.User;
import com.jack.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findAll(){
        List<User> users = userMapper.selectAll();
        System.out.println(users);
    }
    @Test
    public void selectByUcode(){
        User user = userMapper.selectByUcode("yg000001");
        System.out.println(user);
    }
    @Test
    public void updateByUcode(){
        User user=new User("yg000001","ck0002","张三","12344566");
        int i = userMapper.updateByUcode(user, "yg000001");
        System.out.println(i);
    }
    @Test
    public void add(){
        User user=new User("yg000003","ck0002","张三","12344566");
        int add = userMapper.add(user);
        System.out.println(add);
    }
    @Test
    public void delete(){
        int i = userMapper.deleteByUcode("yg000003");
        System.out.println(i);
    }
}
