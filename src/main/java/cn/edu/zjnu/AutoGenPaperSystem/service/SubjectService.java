package cn.edu.zjnu.AutoGenPaperSystem.service;

import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;

import java.util.List;
import java.util.Map;

/**
 * Created by zseapeng on 2016/9/22.
 */
public interface SubjectService {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subjectId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    List selectAllSubject();

    List<Subject> selectByGradeId(int id);
}
