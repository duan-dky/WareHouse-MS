package com.jack.Controller;

import com.jack.Pojo.Part;
import com.jack.Pojo.Part_Pos;
import com.jack.Pojo.Shelves;
import com.jack.Service.InAndOutService;
import com.jack.Service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PartController {

    @Autowired
    private PartService partService;
    @Autowired
    private InAndOutService inAndOutService;

    @GetMapping("partMange")
    public String partMange(){
        return "redirect:/pages/PartInfo.html";
    }

    @RequestMapping("getAllParts")
    @ResponseBody
    public Result getAllPart(){
        List<Part> list = partService.selectAll();
        return new Result(Code.GET_OK,list);
    }
    @PostMapping("/addPart")
    @ResponseBody
    public Result addPart(@RequestBody Part p){
//        System.out.println(p);
        int i = partService.add(p);
        if (i==-1){
            return new Result(Code.SAVE_ERR,0,"该配件已经存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后重试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"添加成功");
        }
    }

    @PostMapping("/editPart")
    @ResponseBody
    public Result editPart(@RequestBody Part p){
//        System.out.println(p);
        int i = partService.update(p, p.getPcode());
//        System.out.println(i);
        if (i==-1){
            return new Result(Code.SAVE_ERR,0,"该配件不存在");
        }
        else if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请稍后重试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"修改成功");
        }
    }

    @GetMapping("/deletePart/{id}")
    @ResponseBody
    public Result deletePart(@PathVariable String id){
//        System.out.println(id);
        int i = partService.delete(id);
//        System.out.println(i);
        if (i==-1){
            return  new Result(Code.DELETE_ERR,0,"该配件不存在");
        }
        else if (i==-2){
            return new Result(Code.DELETE_ERR,0,"仓库中还有此货物，不允许删除");
        }
        else if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }
    @GetMapping("/stockManage")
    public String stockManage(){
        return "redirect:/pages/StockInfo.html";
    }
    @RequestMapping("getAllStock")
    @ResponseBody
    public Result getAllStock(){
        List<Part_Pos> list = inAndOutService.selectAll();
        return new Result(Code.GET_OK,list);
    }

    @PostMapping("/editStock")
    @ResponseBody
    public Result editStock(@RequestBody Part_Pos s){
        System.out.println(s);
        int i = inAndOutService.update(s);
        if (i==0){
            return new Result(Code.SAVE_ERR,0,"系统繁忙，请重试");
        }
        else {
            return new Result(Code.SAVE_OK,0,"修改成功");
        }
    }

    @PostMapping("/deleteStock")
    @ResponseBody
    public Result deleteStock(@RequestBody Part_Pos partPos){
//        System.out.println(partPos);
        int i = inAndOutService.delete(partPos);
        if (i==0){
            return new Result(Code.DELETE_ERR,0,"系统繁忙，请稍后再试");
        }
        else {
            return new Result(Code.DELETE_OK,0,"删除成功");
        }
    }
}
