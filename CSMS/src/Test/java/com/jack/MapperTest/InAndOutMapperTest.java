package com.jack.MapperTest;

import com.jack.Mapper.InAndOutMapper;
import com.jack.Pojo.Part_Pos;
import com.jack.Pojo.Shelves;
import com.jack.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class InAndOutMapperTest {
    @Autowired
    private InAndOutMapper inAndOutMapper;

    @Test
    public void selectByType(){
        List<Shelves> shelves = inAndOutMapper.selectByType("小型");
        System.out.println(shelves);
    }
    @Test
    public void selectByStyRco(){
        List<Part_Pos> partPos = inAndOutMapper.selectByStyRco("小型", "ck0001");
        System.out.println(partPos);
    }
    @Test
    public void selectByRco(){
        List<Part_Pos> partPos = inAndOutMapper.selectByRco("ck0001");
        System.out.println(partPos);
    }
    @Test
    public void selctByPcoRco(){
        List<Part_Pos> partPos = inAndOutMapper.selectByPcoRco("pj00000001", "ck0001");
        System.out.println(partPos);
    }
    @Test
    public void add(){
        Part_Pos partPos=new Part_Pos("pj00000001","ck0001","hj003",20,"大型");
        int i = inAndOutMapper.add(partPos);
        System.out.println(i);
    }
    @Test
    public void update(){
        Part_Pos partPos=new Part_Pos("pj00000001","ck0001","hj003",20,"大型");
        Part_Pos partafter=new Part_Pos("pj00000001","ck0001","hj003",60,"大型");
        int update = inAndOutMapper.update(partafter, partPos);
        System.out.println(update);
    }
    @Test
    public void sub(){
        Part_Pos partafter=new Part_Pos("pj00000001","ck0001","hj003",60,"大型");
        int sub = inAndOutMapper.sub(partafter);
        System.out.println(sub);
    }
}
