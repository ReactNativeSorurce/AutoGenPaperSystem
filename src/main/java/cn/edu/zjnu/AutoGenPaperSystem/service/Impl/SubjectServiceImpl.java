package cn.edu.zjnu.AutoGenPaperSystem.service.Impl;

import cn.edu.zjnu.AutoGenPaperSystem.dao.SubjectMapper;
import cn.edu.zjnu.AutoGenPaperSystem.model.Grade;
import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import cn.edu.zjnu.AutoGenPaperSystem.service.GradeService;
import cn.edu.zjnu.AutoGenPaperSystem.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zseapeng on 2016/9/22.
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectMapper subjectMapper;
    @Resource
    private GradeService gradeServiceImpl;

    public int deleteByPrimaryKey(Integer subjectId) {
        return 0;
    }

    public int insert(Subject record) {
        return 0;
    }

    public int insertSelective(Subject record) {
        return 0;
    }

    public Subject selectByPrimaryKey(Integer subjectId) {
        return null;
    }

    public int updateByPrimaryKeySelective(Subject record) {
        return 0;
    }

    public int updateByPrimaryKey(Subject record) {
        return 0;
    }

    public Map<String, List> selectAllSubject() {
        List<Grade> gradeList = gradeServiceImpl.selectAllGrade();
        List<Map> mapList = new ArrayList<Map>();
        Map<String,String> stringMap = new HashMap<String, String>();
        for (Grade grade:gradeList){
            System.out.println(grade);
        }

        return null;
    }
}
