package ylw.dao;

import ylw.model.Hyxc;

public interface HyxcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hyxc record);

    int insertSelective(Hyxc record);

    Hyxc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hyxc record);

    int updateByPrimaryKeyWithBLOBs(Hyxc record);

    int updateByPrimaryKey(Hyxc record);
}