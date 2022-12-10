package com.jack.Mapper;

import com.jack.Pojo.*;

import java.util.List;

public interface InAndOutMapper {
    /**
     * 添加入库订单请求
     * @param inOrder 业务层传来的订单信息
     * @return 返回处理信息，非零代表入库成功，反之失败
     */
    public int InStorage(InOrder inOrder);

    /**
     * 添加出库订单请求
     * @param outOrder 业务层传来的订单信息
     * @return 返回处理信息，非零代表出库成功，反之失败
     */
    public int OutStorage(OutOrder outOrder);



    /**
     * 根据货架类型查货架
     * @param type 货架类型
     * @return 货架集合
     */
    public  List<Shelves>selectByType(String type);

    /**
     * 添加电脑配件入库信息
     * @param partPos 配件号，仓库号，货架号
     * @return 处理信息，非零成功，零失败
     */
    public int add(Part_Pos partPos);

    /**
     * 查询所有库存信息
     * @return 信息列表
     */
    public List<Part_Pos>selectAll();
    /**
     * 根据货架类型和仓库号查询库存信息
     * @param stype 货架类型
     * @param rcode 仓库号
     * @return 库存信息
     */
    public List<Part_Pos>selectByStyRco(String stype,String rcode);

    /**
     * 根据仓库号查存储信息
     * @param rcode 货架号
     * @return 存储信息
     */
    public List<Part_Pos>selectByRco(String rcode);

    /**
     * 根据货架号查询存储信息
     * @param scode 货架号
     * @return 存储信息
     */
    public List<Part_Pos>selectByScode(String scode);

    public List<Part_Pos>selectByPcode(String pcode);
    /**
     * 处理出库信息（删除电脑配件入库信息）
     * @param partPos 配件号，仓库号，货架号
     * @return 处理信息，非零成功，零失败
     */
    public int sub(Part_Pos partPos);

    /**
     * 修改电脑配件入库信息
     * @param aft 修改后的配件号，仓库号，货架号
     * @param pre 未修改的配件号，仓库号，货架号
     * @return 处理信息，非零成功，零失败
     */
    public int update(Part_Pos aft,Part_Pos pre);

    /**
     * 按照配件号和仓库号查库存信息
     * @param pcode 配件号
     * @param rocde 库存号
     * @return 库存信息
     */
    public List<Part_Pos>selectByPcoRco(String pcode,String rocde);

    /**
     * 查询所有入库订单
     * @return 订单列表
     */
    public List<InOrder> selectAllInOrder();

    /**
     * 删除入库订单
     * @param id 订单编号
     * @return 0失败，其他成功
     */
    public int deleteInOrder(String id);

    /**
     * 查询所有出库订单
     * @return 订单集合
     */
    public List<OutOrder> selectAllOutOrder();

    /**
     * 删除库出库订单
     * @param id 订单编号
     * @return 0失败，其他成功
     */
    public int deleteOutOrder(String id);
}
