package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Charaction;

public interface CharactionMapper {
    int deleteByPrimaryKey(Integer charactId);

    int insert(Charaction record);

    int insertSelective(Charaction record);

    Charaction selectByPrimaryKey(Integer charactId);

    int updateByPrimaryKeySelective(Charaction record);

    int updateByPrimaryKey(Charaction record);
}