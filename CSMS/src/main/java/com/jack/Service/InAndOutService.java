package com.jack.Service;

import com.jack.Pojo.InOrder;
import com.jack.Pojo.OutOrder;
import com.jack.Pojo.Part;
import com.jack.Pojo.Part_Pos;

import java.util.List;
import java.util.Set;

public interface InAndOutService {
    /**
     * 处理入库请求
     * @param inOrder 业务层传来的订单信息
     * @return 返回处理信息，-1无此配件，-2无此仓库，-3容量不足，0数据库错误，其他入库成功
     */
    public int InStorage(InOrder inOrder);

    /**
     * 处理出库请求
     * @param outOrder 业务层传来的订单信息
     * @return 返回处理信息，-3库存容量不足，0数据库错误，其他出库成功
     */
    public int OutStorage(OutOrder outOrder);

    /**
     * 查找所有库存信息
     * @return 库存列表
     */
    public List<Part_Pos>selectAll();

    /**
     * 修改库存信息
     * @param partPos 库存信息
     * @return 0数据库错误，其他成功
     */
    public int update(Part_Pos partPos);

    /**
     * 删除库存信息
     * @param partPos 库存信息
     * @return 0数据库错误，其他成功
     */
    public int delete(Part_Pos partPos);
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

    public List<Part> select(String rcode);
}
