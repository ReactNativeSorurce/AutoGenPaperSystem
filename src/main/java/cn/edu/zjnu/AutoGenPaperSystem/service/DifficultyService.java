package cn.edu.zjnu.AutoGenPaperSystem.service;

import cn.edu.zjnu.AutoGenPaperSystem.model.Difficulty;

/**
 * Created by zseapeng on 2016/9/22.
 */
public interface DifficultyService {
    int deleteByPrimaryKey(Integer difficultyId);

    int insert(Difficulty record);

    int insertSelective(Difficulty record);

    Difficulty selectByPrimaryKey(Integer difficultyId);

    int updateByPrimaryKeySelective(Difficulty record);

    int updateByPrimaryKey(Difficulty record);
}
