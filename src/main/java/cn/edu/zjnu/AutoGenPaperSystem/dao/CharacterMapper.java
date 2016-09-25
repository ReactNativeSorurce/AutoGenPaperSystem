package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Character;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterMapper {
    int deleteByPrimaryKey(Integer charactId);

    int insert(Character record);

    int insertSelective(Character record);

    Character selectByPrimaryKey(Integer charactId);

    int updateByPrimaryKeySelective(Character record);

    int updateByPrimaryKey(Character record);


}