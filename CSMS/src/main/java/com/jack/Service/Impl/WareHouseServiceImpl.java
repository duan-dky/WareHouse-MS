package com.jack.Service.Impl;

import com.jack.Mapper.InAndOutMapper;
import com.jack.Mapper.WareHouseMapper;
import com.jack.Pojo.Part_Pos;
import com.jack.Pojo.Shelves;
import com.jack.Pojo.Storage;
import com.jack.Service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareHouseServiceImpl implements WareHouseService {
    @Autowired
    private WareHouseMapper wareHouseMapper;
    @Autowired
    private InAndOutMapper inAndOutMapper;

    @Override
    public int addStorage(Storage storage) {
        Storage storageCheck=wareHouseMapper.select(storage.getWhcode());
        if (storageCheck!=null){
            return -1;
        }
        else {
            return wareHouseMapper.addStorage(storage);
        }
    }

    @Override
    public int deleteStorage(String whcode) {
        Storage storageCheck=wareHouseMapper.select(whcode);
        List<Part_Pos> partPos = inAndOutMapper.selectByRco(whcode);
        if (storageCheck==null){
            return -1;
        }
        else if(partPos.size()!=0){
            return -2;
        }
        else {
            return wareHouseMapper.deleteStorage(whcode);
        }
    }

    @Override
    public int updateStorage(Storage storage, String whcode) {
        Storage storageCheck=wareHouseMapper.select(whcode);
        if (storageCheck==null){
            return -1;
        }
        else {
            return wareHouseMapper.updateStorage(storage,whcode);
        }
    }

    @Override
    public Storage select(String whcode) {
        return wareHouseMapper.select(whcode);
    }

    @Override
    public List<Storage> selectAll() {
        return wareHouseMapper.selectAll();
    }

    @Override
    public int addShelves(Shelves shelves) {
        Shelves shelvesCheck=wareHouseMapper.selectByScode(shelves.getScode());
        if (shelvesCheck!=null){
            return -1;
        }
        else {
            return wareHouseMapper.addShelves(shelves);
        }
    }

    @Override
    public int deleteShelves(String scode) {
        Shelves shelvesCheck=wareHouseMapper.selectByScode(scode);
        List<Part_Pos> partPos = inAndOutMapper.selectByScode(scode);
        if (shelvesCheck==null){
            return -1;
        }
        else if (partPos.size()!=0){
            return -2;
        }
        else {
            return wareHouseMapper.deleteShelves(scode);
        }
    }

    @Override
    public int updateShelves(Shelves shelves, String scode) {
        Shelves shelvesCheck=wareHouseMapper.selectByScode(scode);
        if (shelvesCheck==null){
            return -1;
        }
        else {
            return wareHouseMapper.updateShelves(shelves,scode);
        }
    }

    @Override
    public Shelves selectByScode(String scode) {
        return wareHouseMapper.selectByScode(scode);
    }

    @Override
    public List<Shelves> selectALl() {
        return wareHouseMapper.selectALl();
    }
}
