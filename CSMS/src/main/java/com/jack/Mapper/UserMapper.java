package com.jack.Mapper;

import com.jack.Pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     * @param user 业务层传来的用户
     * @return 返回添加信息，非零代表添加成功，反之失败
     */
    public int add(User user);

    /**
     * 根据工号删除用户
     * @param Ucode 业务层传回的工号
     * @return 返回删除信息，非零代表删除成功，反之失败
     */
    public int deleteByUcode(String Ucode);

    /**
     * 根据工号修改用户信息
     * @param user 用户要修改的信息
     * @param Ucode 要修改用户的工号
     * @return 返回修改信息，非零代表修改成功，反之失败
     */
    public int updateByUcode(User user,String Ucode);

    /**
     * 根据工号查找用户
     * @param Ucode 要查找用户的工号
     * @return 返回要查找的用户
     */
    public User selectByUcode(String Ucode);

    /**
     * 查找所有用户
     * @return 返回所有用户
     */
    public List<User> selectAll();

}
