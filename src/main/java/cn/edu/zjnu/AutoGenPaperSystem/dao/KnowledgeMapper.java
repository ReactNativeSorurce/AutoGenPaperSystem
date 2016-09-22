package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Knowledge;

public interface KnowledgeMapper {
    int deleteByPrimaryKey(Integer knowledgeId);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    Knowledge selectByPrimaryKey(Integer knowledgeId);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);
}