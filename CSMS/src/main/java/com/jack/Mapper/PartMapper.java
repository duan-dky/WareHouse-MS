package com.jack.Mapper;

import com.jack.Pojo.Part;

import java.util.List;

public interface PartMapper {
    /**
     * 添加配件信息
     * @param part 业务层传回的配件信息
     * @return 返回添加信息，非零代表添加成功，反之失败
     */
    public int add(Part part);

    /**
     * 删除配件信息
     * @param pcode 要删除的配件的配件号
     * @return 返回删除信息，非零代表删除成功，反之失败
     */
    public int delete(String pcode);

    /**
     * 修改配件信息
     * @param part 配件的修改信息
     * @param pcode 要修改信息的配件的配件号
     * @return 返回修改信息，非零代表修改成功，反之失败
     */
    public int update(Part part,String pcode);

    /**
     * 根据配件号查询配件
     * @param pcode 要查询配件的配件号
     * @return 返回要查询的配件
     */
    public Part select(String pcode);

    /**
     * 查询所有配件
     * @return 返回要查询的配件
     */
    public List<Part> selectAll();

    /**
     * 根据配件类型查询配件
     * @param ptype 要查询的配件类型
     * @return 返回要查询的配件
     */
    public List<Part> selectByPtype(String ptype);
}
