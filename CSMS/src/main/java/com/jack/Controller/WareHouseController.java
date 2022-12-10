package com.jack.Controller;

import com.jack.Pojo.LoginUser;
import com.jack.Pojo.Shelves;
import com.jack.Pojo.Storage;
import com.jack.Service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WareHouseController {

    @Autowired
    private WareHouseService wareHouseService;

    @GetMapping("/whManage")
    public String whManage(){
        return "redirect:/pages/WareHouseInfo.html";
    }

    @RequestMapping("/getAllWh")
    @ResponseBody
    public Result getAllWh(){
        List<Storage> list = wareHouseService.selectAll();
        return new Result(Code.GET_OK,list);
    }
    @PostMapping("/addWh")
    @ResponseBody
    public Result addWh(@RequestBody Storage s){
//        System.out.println(s);
        int i = wareHouseService.addStorage(s);
        if (i==-1){
            return  new Result(Code.SAVE_ERR,0,"该仓库已经存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"添加成功");
        }
    }

    @PostMapping("/editWh")
    @ResponseBody
    public Result editWh(@RequestBody Storage s){
//        System.out.println(s);
        int i=wareHouseService.updateStorage(s,s.getWhcode());
        if (i==-1){
            return  new Result(Code.SAVE_ERR,0,"该仓库不存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"修改成功");
        }
    }

    @GetMapping("/deleteWh/{id}")
    @ResponseBody
    public Result delWh(@PathVariable String id){
//        System.out.println(id);
        int i = wareHouseService.deleteStorage(id);
//        System.out.println(i);
        if (i==-1){
            return  new Result(Code.DELETE_ERR,0,"该仓库不存在");
        }
        else if (i==-2){
            return new Result(Code.DELETE_ERR,0,"该仓库有货物，不允许删除");
        }
        else if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }

    @GetMapping("/shManage")
    public String shManage(){
        return "redirect:/pages/ShelvesInfo.html";
    }
    @RequestMapping("/getAllsh")
    @ResponseBody
    public Result getAllSh(){
        List<Shelves> list = wareHouseService.selectALl();
        return new Result(Code.GET_OK,list);
    }
    @PostMapping("/addSh")
    @ResponseBody
    public Result addSh(@RequestBody Shelves s){
//        System.out.println(s);
        int i = wareHouseService.addShelves(s);
        if (i==-1){
            return  new Result(Code.SAVE_ERR,0,"该货架已经存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"添加成功");
        }
    }

    @PostMapping("/editSh")
    @ResponseBody
    public Result editSh(@RequestBody Shelves s){
//        System.out.println(s);
        int i = wareHouseService.updateShelves(s, s.getScode());
        if (i==-1){
            return  new Result(Code.SAVE_ERR,0,"该货架不存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"修改成功");
        }
    }

    @GetMapping("/deleteSh/{id}")
    @ResponseBody
    public Result delSh(@PathVariable String id){
//        System.out.println(id);
        int i = wareHouseService.deleteShelves(id);
        if (i==-1){
            return  new Result(Code.DELETE_ERR,0,"该货架不存在");
        }
        else if (i==-2){
            return new Result(Code.DELETE_ERR,0,"该货架有货物，不允许删除");
        }
        else if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }
}
