package cn.edu.zjnu.AutoGenPaperSystem.controller;

import cn.edu.zjnu.AutoGenPaperSystem.model.SearchAll;
import cn.edu.zjnu.AutoGenPaperSystem.service.KnowledgeService;
import cn.edu.zjnu.AutoGenPaperSystem.service.QuestionsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zseapeng on 2016/9/27.
 * 一些实验性内容，并不完善
 */
@Controller
@RequestMapping(value = "/tiku")
@ResponseBody
public class TiKuController {

    @Resource
    private QuestionsService questionsServiceImpl;
    @Resource
    private KnowledgeService knowledgeServiceImpl;

    private static SearchAll searchAll = new SearchAll();
    private int sub_id = 0;
    private int point_id = 0;
    private int grade_id = 0;
    private String sub_name = "";
    private String others = "";


    @RequestMapping(value = "/{grade_id}/{subjectName}", method = RequestMethod.GET)

    public Map getSubject(@PathVariable int grade_id,
                          @PathVariable String subjectName) {
        System.out.println("subjectName---->" + subjectName);
        this.sub_name = subjectName;
        this.grade_id = grade_id;
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher matcher = p.matcher(subjectName);
        this.sub_id = Integer.parseInt(matcher.replaceAll("").trim());
        return knowledgeServiceImpl.selectFirstKnowledgeBySubjectId(this.sub_id,
                this.grade_id,this.others,this.sub_name);
    }

    @RequestMapping(value = "/**/**/point{point_id}", method = RequestMethod.GET)
    public String getPointId(@PathVariable int point_id) {
        this.point_id = point_id;
        System.out.println("point_id---->" + this.point_id);
        return "1";
    }

    @RequestMapping(value = "/**/**/**/{others}", method = RequestMethod.GET)
    public String getOthers(@PathVariable String others) {


        System.out.println("others--->" + others);
        return "1";
    }
}
