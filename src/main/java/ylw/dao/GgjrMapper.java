package ylw.dao;

import ylw.model.Ggjr;
import ylw.model.GgjrWithBLOBs;

public interface GgjrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GgjrWithBLOBs record);

    int insertSelective(GgjrWithBLOBs record);

    GgjrWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GgjrWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GgjrWithBLOBs record);

    int updateByPrimaryKey(Ggjr record);
}