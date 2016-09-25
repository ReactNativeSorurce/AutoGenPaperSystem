package cn.edu.zjnu.AutoGenPaperSystem.dao;

import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapper {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subjectId);

    Subject selectBysubjectname(String subjectname);

    List<Subject> selectAllsubject();

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}