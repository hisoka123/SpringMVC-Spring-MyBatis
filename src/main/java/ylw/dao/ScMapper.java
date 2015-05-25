package ylw.dao;

import ylw.model.Sc;

public interface ScMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sc record);

    int insertSelective(Sc record);

    Sc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}