package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Grade;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer cradeId);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer cradeId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}