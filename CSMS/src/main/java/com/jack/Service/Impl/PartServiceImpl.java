package com.jack.Service.Impl;

import com.jack.Mapper.InAndOutMapper;
import com.jack.Mapper.PartMapper;
import com.jack.Pojo.Part;
import com.jack.Pojo.Part_Pos;
import com.jack.Service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartServiceImpl implements PartService {
    @Autowired
    private PartMapper partMapper;
    @Autowired
    private InAndOutMapper inAndOutMapper;

    @Override
    public int add(Part part) {
        Part partCheck=partMapper.select(part.getPcode());
        if (partCheck!=null){
            return -1;
        }
        else {
            return partMapper.add(part);
        }
    }

    @Override
    public int delete(String pcode) {
        Part partCheck=partMapper.select(pcode);
        List<Part_Pos> partPos = inAndOutMapper.selectByPcode(pcode);
        if (partCheck==null){
            return -1;
        }
        else if (partPos.size()!=0){
            return -2;
        }
        else {
            return partMapper.delete(pcode);
        }
    }

    @Override
    public int update(Part part, String pcode) {
        Part partCheck=partMapper.select(pcode);
        if (partCheck==null){
            return -1;
        }
        else {
            return partMapper.update(part,pcode);
        }
    }

    @Override
    public List<Part> selectAll() {
        return partMapper.selectAll();
    }

    @Override
    public Part select(String pcode) {
        return partMapper.select(pcode);
    }

    @Override
    public List<Part> selectByRcode(String rcode) {
        List<Part_Pos>pos= inAndOutMapper.selectByRco(rcode);
        List<Part> parts=new ArrayList<Part>();
        for (Part_Pos p:pos){
            Part part=partMapper.select(p.getPcode());
            parts.add(part);
        }
        return parts;
    }

    @Override
    public List<Part> selectByPtype(String ptype) {
        return partMapper.selectByPtype(ptype);
    }
}
