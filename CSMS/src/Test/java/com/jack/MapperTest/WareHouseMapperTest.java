package com.jack.MapperTest;

import com.jack.Mapper.WareHouseMapper;
import com.jack.Pojo.Shelves;
import com.jack.Pojo.Storage;
import com.jack.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class WareHouseMapperTest {
    @Autowired
    private WareHouseMapper wareHouseMapper;

    @Test
    public void selectAll(){
        List<Storage> storages = wareHouseMapper.selectAll();
        System.out.println(storages);
    }

    @Test
    public void addStorage(){
        Storage storage=new Storage("ck003","三号仓","只因区",20,30,40);
        int i = wareHouseMapper.addStorage(storage);
        System.out.println(i);
    }
    @Test
    public void updateStorage(){
        Storage storage=new Storage("ck003","三号2仓","只因区",20,30,40);
        int i = wareHouseMapper.updateStorage(storage, "ck003");
        System.out.println(i);
    }
    @Test
    public void deleteStorage(){
        int i = wareHouseMapper.deleteStorage("ck003");
        System.out.println(i);
    }

    @Test
    public void selectAllSh(){
        List<Shelves> shelves = wareHouseMapper.selectALl();
        System.out.println(shelves);
    }

    @Test
    public void addSh(){
        Shelves shelves=new Shelves("hj000003","中型",40);
        int i = wareHouseMapper.addShelves(shelves);
        System.out.println(i);
    }
    @Test
    public void updateShelves(){
        Shelves shelves=new Shelves("hj000003","中型",80);
        int i = wareHouseMapper.updateShelves(shelves, "hj000003");
        System.out.println(i);
    }
    @Test
    public void deleteSh(){
        int i = wareHouseMapper.deleteShelves("hj000003");
        System.out.println(i);
    }
    @Test
    public void selectByScode(){
        Shelves shelves = wareHouseMapper.selectByScode("hj000001");
        System.out.println(shelves);
    }
}
