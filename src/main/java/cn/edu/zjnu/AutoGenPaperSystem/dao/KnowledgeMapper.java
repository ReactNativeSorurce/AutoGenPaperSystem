package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Knowledge;
import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KnowledgeMapper {
    int deleteByPrimaryKey(Integer knowledgeId);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    Knowledge selectByPrimaryKey(Integer knowledgeId);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);

    List<Knowledge> selectKnowledgeBySubjectId(Integer subjectId);
}