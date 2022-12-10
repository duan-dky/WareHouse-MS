package com.jack.Service;

import com.jack.Pojo.LoginUser;
import com.jack.Pojo.User;

import java.util.List;


public interface UserService {
    /**
     * 添加用户
     * @param user 表现层传来的用户
     * @return 返回添加信息，-1该用户已存在，-2仓库不存在,0数据库错误，2添加成功
     */
    public int add(User user);

    /**
     * 根据工号删除用户
     * @param Ucode 业务层传回的工号
     * @return 返回删除信息，-1该用户不存在，0数据库错误，2删除成功
     */
    public int deleteByUcode(String Ucode);

    /**
     * 根据工号修改用户信息
     * @param user 用户要修改的信息
     * @param Ucode 要修改用户的工号
     * @return 返回修改信息，-1该用户不存在，0数据库错误，-2所修改的仓库不存在，其他修改成功
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
