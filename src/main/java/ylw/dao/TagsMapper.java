package ylw.dao;

import ylw.model.Tags;

public interface TagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKeyWithBLOBs(Tags record);

    int updateByPrimaryKey(Tags record);
}