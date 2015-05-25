package ylw.dao;

import ylw.model.Sysconfig;

public interface SysconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysconfig record);

    int insertSelective(Sysconfig record);
}