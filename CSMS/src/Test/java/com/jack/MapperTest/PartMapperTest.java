package com.jack.MapperTest;

import com.jack.Mapper.PartMapper;
import com.jack.Pojo.Part;
import com.jack.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class PartMapperTest {
    @Autowired
    private PartMapper partMapper;

    @Test
    public void selectAll(){
        List<Part> parts = partMapper.selectAll();
        System.out.println(parts);
    }

    @Test
    public void select(){
        Part select = partMapper.select("pj00000001");
        System.out.println(select);
    }

    @Test
    public void selectByPtype(){
        List<Part> parts = partMapper.selectByPtype("显卡");
        System.out.println(parts);
    }

    @Test
    public void add(){
        Part part=new Part("pj00000003","GPro wireless","鼠标","罗技",new Timestamp(System.currentTimeMillis()),2,"狗屁王",20 );
        int i = partMapper.add(part);
        System.out.println(i);
    }
    @Test
    public void update(){
        Part part=new Part("pj00000003","GPro wireless","鼠标2","罗技",new Timestamp(System.currentTimeMillis()),2,"狗屁王",20 );
        int i = partMapper.update(part, "pj00000003");
        System.out.println(i);
    }
    @Test
    public void delete(){
        int i = partMapper.delete("pj00000003");
        System.out.println(i);
    }
}
