package com.jack.Service;

import com.jack.Pojo.Shelves;
import com.jack.Pojo.Storage;

import java.util.List;

public interface WareHouseService {
    /**
     * 添加仓库
     * @param storage 业务层传来的仓库信息
     * @return 返回处理信息，-1仓库已存在，0数据库错误，其它成功
     */
    public int addStorage(Storage storage);

    /**
     * 删除仓库
     * @param whcode 要删除仓库的仓库号
     * @return 返回处理信息，-1仓库不存在，0数据库错误，其它成功,-2代表仓库有货物
     */
    public int deleteStorage(String whcode);

    /**
     * 修改仓库信息
     * @param storage 仓库的修改信息
     * @param whcode 要修改的仓库的仓库号
     * @return 返回处理信息，-1仓库不存在，0数据库错误，其它成功
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
     * @return 返回处理信息，-1货架已存在，0数据库错误，其它成功
     */
    public int addShelves(Shelves shelves);

    /**
     * 删除货架
     * @param scode 货架号
     * @return 返回处理信息，-1货架不存在，0数据库错误，-2货架上还有货物，其它成功
     */
    public int deleteShelves(String scode );

    /**
     * 修改货架信息
     * @param shelves 要修改的货架信息
     * @param scode 货架号
     * @return 返回处理信息，-1货架不存在，0数据库错误，其它成功
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
