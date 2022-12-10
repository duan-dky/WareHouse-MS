package com.jack.Mapper;

import com.jack.Pojo.Shelves;
import com.jack.Pojo.Storage;

import java.util.List;

public interface WareHouseMapper {
    /**
     * 添加仓库
     * @param storage 业务层传来的仓库信息
     * @return 返回处理信息，非零代表添加成功，反之失败
     */
    public int addStorage(Storage storage);

    /**
     * 删除仓库
     * @param whcode 要删除仓库的仓库号
     * @return 返回处理信息，非零代表删除成功，反之失败
     */
    public int deleteStorage(String whcode);

    /**
     * 修改仓库信息
     * @param storage 仓库的修改信息
     * @param whcode 要修改的仓库的仓库号
     * @return 返回处理信息，非零代表修改成功，反之失败
     */
    public int updateStorage(Storage storage,String whcode);
    /**
     * 根据仓库号查仓库
     * @param whcode 仓库号
     * @return 仓库信息
     */
    public Storage select(String whcode);

    /**
     * 查询所有仓库信息
     * @return 返回所有仓库信息
     */
    public List<Storage> selectAll();

    /**
     * 添加货架
     * @param shelves 货架信息
     * @return 返回处理信息，非零代表成功，反之失败
     */
    public int addShelves(Shelves shelves);

    /**
     * 删除货架
     * @param scode 货架号
     * @return 返回处理信息，非零代表成功，反之失败
     */
    public int deleteShelves(String scode );

    /**
     * 修改货架信息
     * @param shelves 要修改的货架信息
     * @param scode 货架号
     * @return 返回处理信息，非零代表成功，反之失败
     */
    public int updateShelves(Shelves shelves,String scode);

    /**
     * 根据货架号查货架信息
     * @param scode 货架号
     * @return 货架信息
     */
    public Shelves selectByScode(String scode);

    /**
     * 查询所有货架
     * @return 货架信息集合
     */
    public List<Shelves> selectALl();
}
