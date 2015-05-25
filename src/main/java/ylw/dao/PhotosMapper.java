package ylw.dao;

import ylw.model.Photos;
import ylw.model.PhotosWithBLOBs;

public interface PhotosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhotosWithBLOBs record);

    int insertSelective(PhotosWithBLOBs record);

    PhotosWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhotosWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PhotosWithBLOBs record);

    int updateByPrimaryKey(Photos record);
}