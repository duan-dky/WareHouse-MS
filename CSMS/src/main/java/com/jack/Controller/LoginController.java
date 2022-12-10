package com.jack.Controller;

import com.alibaba.fastjson.JSON;
import com.jack.Pojo.Storage;
import com.jack.Pojo.User;
import com.jack.Service.LoginService;
import com.jack.Service.PartService;
import com.jack.Service.UserService;
import com.jack.Service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;
    @Autowired
    private WareHouseService wareHouseService;

    @GetMapping
    public String tologin(){
        return "redirect:pages/login.html";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        String username= request.getParameter("username");
        String password=request.getParameter("password");
        Map<String,String> map=new HashMap<String, String>();
        map.put("name",username);
        map.put("password",password);
        int login = loginService.login(map);
        if (login==0){
            return "redirect:pages/index.html?"+username;
        }
        else if (login==1){
            return "redirect:/pages/InAndOut.html?"+username;
        }
        else {
            return "redirect:pages/login.html";
        }
    }

    @GetMapping("/index")
    public String index(){
        return "redirect:pages/index.html";
    }
    @GetMapping("/getAll")
    @ResponseBody
    public Result findAll(){
        List<Storage> storages = wareHouseService.selectAll();
        List<String> list=new ArrayList<String>();
        for (Storage s:storages){
            int sum=0;
            sum=s.getSnum()+s.getMnum()+s.getBnum();
            StorageRest rest=new StorageRest(s.getWhname(),sum);
            String json= JSON.toJSONString(rest);
            list.add(json);
        }
        String s1=list.toString();
        return new Result(Code.GET_OK,s1);
    }
}
