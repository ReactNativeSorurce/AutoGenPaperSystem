package cn.edu.zjnu.AutoGenPaperSystem.service;

/**
 * Created by zseapeng on 2016/9/22.
 */
public interface CharacterService {
    int deleteByPrimaryKey(Integer charactId);

    int insert(Character record);

    int insertSelective(Character record);

    Character selectByPrimaryKey(Integer charactId);

    int updateByPrimaryKeySelective(Character record);

    int updateByPrimaryKey(Character record);
}
