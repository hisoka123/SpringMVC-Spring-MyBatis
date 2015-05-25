package ylw.dao;

import ylw.model.Msg;
import ylw.model.MsgWithBLOBs;

public interface MsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgWithBLOBs record);

    int insertSelective(MsgWithBLOBs record);

    MsgWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MsgWithBLOBs record);

    int updateByPrimaryKey(Msg record);
}