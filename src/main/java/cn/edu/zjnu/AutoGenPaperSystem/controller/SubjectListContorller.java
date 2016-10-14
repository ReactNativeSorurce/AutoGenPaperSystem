package cn.edu.zjnu.AutoGenPaperSystem.controller;

import cn.edu.zjnu.AutoGenPaperSystem.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zseapeng on 2016/9/26.
 */
@Controller
@RequestMapping(value = "/api/subjectlist")
@ResponseBody
public class SubjectListContorller {

    @Resource
    private SubjectService subjectServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public List getSubjectList() {
        return subjectServiceImpl.selectAllSubject();
    }

}
