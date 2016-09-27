package cn.edu.zjnu.AutoGenPaperSystem.service.Impl;

import cn.edu.zjnu.AutoGenPaperSystem.dao.QuestionsMapper;
import cn.edu.zjnu.AutoGenPaperSystem.model.Questions;
import cn.edu.zjnu.AutoGenPaperSystem.model.SearchAll;
import cn.edu.zjnu.AutoGenPaperSystem.service.QuestionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/22.
 */
@Service
public class QuestionsServiceImpl implements QuestionsService {

    @Resource
    private QuestionsMapper questionsMapper;

    public int deleteByPrimaryKey(Integer questionsId) {
        return 0;
    }

    public int insert(Questions record) {
        return 0;
    }

    public int insertSelective(Questions record) {
        return 0;
    }

    public Questions selectByPrimaryKey(Integer questionsId) {
        return null;
    }

    public int updateByPrimaryKeySelective(Questions record) {
        return 0;
    }

    public int updateByPrimaryKey(Questions record) {
        return 0;
    }

    public List<Questions> selectBySearchAll(SearchAll searchAll) {
        return questionsMapper.selectBySearchAll(searchAll);
    }
}
