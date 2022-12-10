package com.jack.Service;

import com.jack.Pojo.LoginUser;

import java.util.List;
import java.util.Map;

public interface LoginService {
    /**
     * 登录
     * @param map 表现层传来的username和password
     * @return 0管理员，1普通用户，2无此用户
     */
    public int login(Map map);

    /**
     * 修改登录用户的信息
     * @param user 用户的修改信息
     * @param id 要修改信息的用户id
     * @return 返回修改信息，-1该用户不存在，0数据库出错，其他表示修改成功
     */
    public int updateById(LoginUser user,String id);

    /**
     * 查询所有用户
     * @return 返回所有用户
     */
    public List<LoginUser> selectAll();
}
