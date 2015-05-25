package ylw.dao;

import ylw.model.Pybq;

public interface PybqMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pybq record);

    int insertSelective(Pybq record);

    Pybq selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pybq record);

    int updateByPrimaryKeyWithBLOBs(Pybq record);

    int updateByPrimaryKey(Pybq record);
}