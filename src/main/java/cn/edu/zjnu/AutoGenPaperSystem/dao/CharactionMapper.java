package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Charaction;

import java.util.List;

public interface CharactionMapper {
    int deleteByPrimaryKey(Integer charactId);

    int insert(Charaction record);

    int insertSelective(Charaction record);

    Charaction selectByPrimaryKey(Integer charactId);

    int updateByPrimaryKeySelective(Charaction record);

    int updateByPrimaryKey(Charaction record);

    List<Charaction> selectAllCharat();
}