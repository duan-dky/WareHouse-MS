package com.jack.Controller;

import com.jack.Pojo.LoginUser;
import com.jack.Pojo.User;
import com.jack.Service.LoginService;
import com.jack.Service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @GetMapping("users")
    public String userManager(){

        return "redirect:/pages/UsersInfo.html";
    }
    @GetMapping("/getAllUsers")
    @ResponseBody
    public Result getAllUsers(){
        List<User> userList = userService.selectAll();
        return new Result(Code.GET_OK,userList);
    }
    @PostMapping("/addUser")
    @ResponseBody
    public Result addUser(@RequestBody User user){
        int i = userService.add(user);
        if (i==2){
            return new Result(Code.SAVE_OK,0,"添加成功");
        }
        else if(i==-2){
            return new Result(Code.SAVE_ERR,0,"该仓库不存在");
        }
        else if(i==-1){
            return new Result(Code.SAVE_ERR,0,"该用户已存在");
        }
        else {
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }

    }

    @PostMapping("/editUser")
    @ResponseBody
    public Result editUser(@RequestBody User user){
//        System.out.println(user);
        int i=userService.updateByUcode(user,user.getUcode());
//        System.out.println(i);
        if (i==-1){
            return new Result(Code.SAVE_ERR,0,"该用户不存在");
        }
        else if(i==-2){
            return new Result(Code.SAVE_ERR,0,"所修改的仓库不存在");
        }
        else if(i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"修改成功");
        }

    }

    @GetMapping("/deleteUser/{ucode}")
    @ResponseBody
    public Result delUser(@PathVariable String ucode){
//        System.out.println(ucode);
        int i=userService.deleteByUcode(ucode);
//        System.out.println(i);
        if (i==2){
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
        else if (i==-1){
            return new Result(Code.DELETE_ERR,0,"该用户不存在");
        }
        else {
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后再试");
        }

    }
    @GetMapping("loginManage")
    public String loginManager(){
        return "redirect:/pages/Permit.html";
    }

    @GetMapping("/getAllPermit")
    @ResponseBody
    public Result getAllPermit(){
        List<LoginUser> loginUsers = loginService.selectAll();
        return new Result(Code.GET_OK,loginUsers);
    }


    @PostMapping("/editPermit")
    @ResponseBody
    public Result editPermit(@RequestBody LoginUser user){
//        System.out.println(user);
        int i= loginService.updateById(user,user.getId());
        if (i==-1){
            return new Result(Code.SAVE_ERR,0,"该用户不存在");
        }
        else if(i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后重试");
        }
        else{
            return new Result(Code.SAVE_OK,0,"修改成功");
        }
    }

}
