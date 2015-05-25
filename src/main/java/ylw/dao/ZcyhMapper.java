package ylw.dao;

import ylw.model.Zcyh;

public interface ZcyhMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zcyh record);

    int insertSelective(Zcyh record);

    Zcyh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zcyh record);

    int updateByPrimaryKey(Zcyh record);
}