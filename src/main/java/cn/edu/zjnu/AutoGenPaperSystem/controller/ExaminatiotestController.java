package cn.edu.zjnu.AutoGenPaperSystem.controller;

import cn.edu.zjnu.AutoGenPaperSystem.model.Subject;
import cn.edu.zjnu.AutoGenPaperSystem.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sgt on 2016/9/25.
 */
@Controller
@RequestMapping("/subjectlist")
public class ExaminatiotestController {
    @Resource
    private SubjectService subjectService;

    private List<Subject> subjects;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> allsubject(){
        subjects=subjectService.selectAllsubject();
        return subjects;
    }
}
