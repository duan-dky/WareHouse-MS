package com.jack.Controller;

import com.jack.Pojo.InOrder;
import com.jack.Pojo.OutOrder;
import com.jack.Pojo.Part_Pos;
import com.jack.Service.InAndOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private InAndOutService inAndOutService;

    @GetMapping("/inOrderManage")
    public String inOrderManage(){
        return "redirect:/pages/Inorder.html";
    }

    @GetMapping("/getAllin")
    @ResponseBody
    public Result findAllin(){
        List<InOrder> orders = inAndOutService.selectAllInOrder();
        return new Result(Code.GET_OK,orders);
    }

    @GetMapping("/deleteIn/{id}")
    @ResponseBody
    public Result deleteIn(@PathVariable String id){
//        System.out.println(id);
        int i = inAndOutService.deleteInOrder(id);
//        System.out.println(i);
        if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后重试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }

    @GetMapping("/outOrderManage")
    public String outOrderManage(){
        return "redirect:/pages/Outorder.html";
    }
    @GetMapping("/getAllout")
    @ResponseBody
    public Result findAllOut(){
        List<OutOrder> orders = inAndOutService.selectAllOutOrder();
        return new Result(Code.GET_OK,orders);
    }

    @GetMapping("/deleteOut/{id}")
    @ResponseBody
    public Result deleteOut(@PathVariable String id){
//        System.out.println(id);
        int i = inAndOutService.deleteOutOrder(id);
//        System.out.println(i);
        if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后重试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }
}
