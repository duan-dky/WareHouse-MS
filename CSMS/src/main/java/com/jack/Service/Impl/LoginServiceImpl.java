package com.jack.Service.Impl;

import com.jack.Mapper.LoginMapper;
import com.jack.Mapper.UserMapper;
import com.jack.Pojo.LoginUser;
import com.jack.Pojo.User;
import com.jack.Service.LoginService;
import com.jack.tool.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static org.mybatis.spring.SqlSessionUtils.getSqlSession;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public int login(Map map) {
        if(map!=null) {
            String username=(String) map.get("name");
            String password=new Encrypt().md5((String) map.get("password"));
            LoginUser user=loginMapper.findUser(username);
            if(user==null) {
                return 2;
            }
            else {
                if (password.equals(user.getPasswd())){
                    //身份为管理员
                    if(user.getIdtype()==0){
                        return 0;
                    }
                    //身份为普通用户
                    else{
                        return 1;
                    }
                }
                else {
                    return 2;
                }
            }
        }
        else {
            return 2;
        }
    }


    @Override
    public int updateById(LoginUser user, String id) {
        LoginUser userCheck=loginMapper.findUser(id);
        if(userCheck==null){
            return -1;
        }
        else {
            return loginMapper.updateById(user,id);
        }
    }

    @Override
    public List<LoginUser> selectAll() {
        return loginMapper.selectAll();
    }
}
