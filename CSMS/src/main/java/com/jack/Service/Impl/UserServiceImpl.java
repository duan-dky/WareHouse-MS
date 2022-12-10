package com.jack.Service.Impl;

import com.jack.Mapper.LoginMapper;
import com.jack.Mapper.UserMapper;
import com.jack.Mapper.WareHouseMapper;
import com.jack.Pojo.LoginUser;
import com.jack.Pojo.Storage;
import com.jack.Pojo.User;
import com.jack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private WareHouseMapper wareHouseMapper;
    @Override
    public int add(User user) {
        User userCheck=userMapper.selectByUcode(user.getUcode());
        Storage select = wareHouseMapper.select(user.getRcode());
        if (userCheck!=null){
            return -1;
        }
        else if (select==null){
            return -2;
        }
        else {
            int flag1=userMapper.add(user);
            LoginUser loginUser=new LoginUser(user.getUcode(), user.getUcode(), "邮箱待添加",1);
            int flag2=loginMapper.addUser(loginUser);
            if(flag1==0||flag2==0){
                if (flag1!=0){
                    userMapper.deleteByUcode(user.getUcode());
                }
                if (flag2!=0){
                    loginMapper.deleteById(user.getUcode());
                }
                return 0;
            }
            else {
                return 2;
            }
        }
    }

    @Override
    public int deleteByUcode(String Ucode) {
        User userCheck=userMapper.selectByUcode(Ucode);
        LoginUser loginUserCheck=loginMapper.findUser(Ucode);
        if (userCheck==null){
            return -1;
        }
        else {
            int flag1=userMapper.deleteByUcode(Ucode);
            int flag2=loginMapper.deleteById(Ucode);
            if(flag1==0){
                return 0;
            }
            else {
                return 2;
            }
        }
    }

    @Override
    public int updateByUcode(User user, String Ucode) {
        User userCheck=userMapper.selectByUcode(user.getUcode());
        Storage storage = wareHouseMapper.select(user.getRcode());
        if (userCheck==null){
            return -1;
        }
        else if (storage==null){
            return -2;
        }
        else {
            return userMapper.updateByUcode(user,Ucode);
        }
    }

    @Override
    public User selectByUcode(String Ucode) {
        return userMapper.selectByUcode(Ucode);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

}
