package ylw.dao;

import ylw.model.Zt;

public interface ZtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zt record);

    int insertSelective(Zt record);

    Zt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zt record);

    int updateByPrimaryKey(Zt record);
}