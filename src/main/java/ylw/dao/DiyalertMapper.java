package ylw.dao;

import ylw.model.Diyalert;

public interface DiyalertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Diyalert record);

    int insertSelective(Diyalert record);

    Diyalert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Diyalert record);

    int updateByPrimaryKeyWithBLOBs(Diyalert record);

    int updateByPrimaryKey(Diyalert record);
}