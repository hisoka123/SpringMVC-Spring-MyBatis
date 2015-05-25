package ylw.dao;

import ylw.model.Txl;
import ylw.model.TxlWithBLOBs;

public interface TxlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TxlWithBLOBs record);

    int insertSelective(TxlWithBLOBs record);

    TxlWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxlWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TxlWithBLOBs record);

    int updateByPrimaryKey(Txl record);
}