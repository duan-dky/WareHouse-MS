package com.jack.Mapper;

import com.jack.Pojo.LoginUser;

import java.util.List;

public interface LoginMapper {
    /**
     * 根据id查找用户
     * @param id 业务层传回的id
     * @return 返回id对应的用户
     */
    public LoginUser findUser(String id);

    /**
     * 添加登录用户
     * @param user 业务层传回的LoginUser对象
     * @return 返回添加信息，非零代表添加成功，反之失败
     */
    public int addUser(LoginUser user);

    /**
     * 删除登录用户
     * @param id 业务层传回要删除用户的id
     * @return 返回删除信息，非零代表删除成功，反之失败
     */
    public int deleteById(String id);

    /**
     * 修改登录用户的信息
     * @param user 用户的修改信息
     * @param id 要修改信息的用户id
     * @return 返回修改信息，非零代表修改成功，反之失败
     */
    public int updateById(LoginUser user,String id);


    /**
     * 查询所有用户
     * @return 返回所有用户
     */
    public List<LoginUser>selectAll();
}
