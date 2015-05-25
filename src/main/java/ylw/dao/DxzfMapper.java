package ylw.dao;

import ylw.model.Dxzf;

public interface DxzfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dxzf record);

    int insertSelective(Dxzf record);

    Dxzf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dxzf record);

    int updateByPrimaryKeyWithBLOBs(Dxzf record);
}