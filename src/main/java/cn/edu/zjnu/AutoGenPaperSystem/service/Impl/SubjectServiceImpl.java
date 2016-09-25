package cn.edu.zjnu.AutoGenPaperSystem.service.Impl;

import cn.edu.zjnu.AutoGenPaperSystem.dao.SubjectMapper;
import cn.edu.zjnu.AutoGenPaperSystem.model.Grade;
import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import cn.edu.zjnu.AutoGenPaperSystem.service.GradeService;
import cn.edu.zjnu.AutoGenPaperSystem.service.SubjectService;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;
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
        Map<String,List> gradeMap = new HashMap<String, List>();
        for (Grade grade:gradeList){
            try {
                List<Map> mapList = new ArrayList<Map>();
                String gradeName = PinyinHelper.convertToPinyinString(grade.getGradeName(),"", PinyinFormat.WITHOUT_TONE);
                List<Subject> subjectList = subjectMapper.selectByGradeId(grade.getGradeId());
                for (Subject s:subjectList){
                    if (grade.getGradeId() == s.getGradeId()){
                        Map<String,String> stringMap = new HashMap<String, String>();
                        String url = "/"+PinyinHelper.convertToPinyinString(s.getSubjectName(),"",PinyinFormat.WITHOUT_TONE)+s.getGradeId();
                        stringMap.put("url",url);
                        stringMap.put("context",s.getSubjectName());
                        mapList.add(stringMap);
                    }
                }
                gradeMap.put(gradeName,mapList);
            } catch (PinyinException e) {
                e.printStackTrace();
            }
        }
        //
        System.out.println(gradeMap);
        return gradeMap;
    }

    public List<Subject> selectByGradeId(int id) {
        return subjectMapper.selectByGradeId(id);
    }
}
