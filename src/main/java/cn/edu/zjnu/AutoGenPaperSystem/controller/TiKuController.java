package cn.edu.zjnu.AutoGenPaperSystem.controller;

import cn.edu.zjnu.AutoGenPaperSystem.model.SearchAll;
import cn.edu.zjnu.AutoGenPaperSystem.service.KnowledgeService;
import cn.edu.zjnu.AutoGenPaperSystem.service.QuestionsService;
import cn.edu.zjnu.AutoGenPaperSystem.service.SubjectService;
import cn.edu.zjnu.AutoGenPaperSystem.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
    @Resource
    private SubjectService subjectServiceImpl;
    @Resource
    private TypeService typeServiceImpl;

    private static SearchAll searchAll = new SearchAll();


    private int sub_id;
    private String point_id;
    private int grade_id;
    private String sub_name;
    private String others;


    @RequestMapping(value = "/{grade_id}/{subjectName}/point{point_id}",method = RequestMethod.GET)
    public Map getInfo(@PathVariable int grade_id,
                          @PathVariable String subjectName,
                          @PathVariable String point_id) {
        init();
        Map<String, List> allMap = new HashMap<String, List>();
        setParam(subjectName,grade_id,point_id);
        List knowLedgeList = knowledgeServiceImpl.selectFirstKnowledgeBySubjectId(this.sub_id,
                this.grade_id, this.others, this.sub_name);
        List typesList = typeServiceImpl.selectTypesBySubjectId(sub_id, grade_id, sub_name, others, this.point_id);
        System.out.println("subname---->" + this.sub_name);
        allMap.put("Points", knowLedgeList);
        allMap.put("Types", typesList);
        return allMap;
    }

    @RequestMapping(value = "/{grade_id}/{subjectName}/point{point_id}/{others}", method = RequestMethod.GET)
    public Map getOthers(@PathVariable String others,
                         @PathVariable int grade_id,
                         @PathVariable String subjectName,
                         @PathVariable String point_id) {
        init();
        setParam(subjectName,grade_id,point_id);
        System.out.println("subnameEnd---->" + this.sub_name);
        this.others = others;
        System.out.println("other---->" + this.others);
        return null;
    }

    @RequestMapping(value = "/{grade_id}/{subjectName}/point{point_id}/questionlist", method = RequestMethod.GET)
    public Map getQuestionList(@PathVariable int grade_id,
                               @PathVariable String subjectName,
                               @PathVariable String point_id,
                               @RequestParam int page) {

        System.out.println("page--->" + page);
        setParam(subjectName,grade_id,point_id);
        System.out.println("point--->" + this.point_id);
        System.out.println("Integer.valueOf(this.point_id)--->" + Integer.valueOf(this.point_id));
        searchAll.setSub_id(this.sub_id);
        searchAll.setKnow_id(Integer.valueOf(this.point_id));
        System.out.println("searchAll--->" + searchAll);
        System.out.println(questionsServiceImpl.selectBySearchAll(searchAll, page));
        return null;
    }

    @RequestMapping(value = "/{grade_id}/{subjectName}/point{point_id}/{others}/questionlist", method = RequestMethod.GET)
    public Map getQuestionList(@PathVariable int grade_id,
                               @PathVariable String subjectName,
                               @PathVariable String point_id,
                               @PathVariable String others,
                               @RequestParam int page) {

        setParam(subjectName,grade_id,point_id);
        this.others = others;
        searchAll.setSub_id(this.sub_id);
        searchAll.setKnow_id(Integer.valueOf(this.point_id));

        String reg = "t(\\d+)d(\\d+)c(\\d+)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(others);
        System.out.println("count---->"+matcher.groupCount());
        if (matcher.find()){
            System.out.println("t-->"+matcher.group(1));
            searchAll.setTypes_id(Integer.parseInt(matcher.group(1)));
            searchAll.setDiff_id(Integer.parseInt(matcher.group(2)));
            searchAll.setChar_id(Integer.parseInt(matcher.group(3)));
        }
        System.out.println("searchAll--->" + searchAll);
        System.out.println(questionsServiceImpl.selectBySearchAll(searchAll, page));
        return null;
    }

    private void init() {
        sub_id = 0;
        point_id = "";
        grade_id = 0;
        sub_name = "";
        others = "";
    }

    private void setParam(String subjectName,int grade_id,String point_id) {
        this.sub_name = subjectName;
        this.grade_id = grade_id;
        this.point_id = point_id;
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher matcher = p.matcher(subjectName);
        this.sub_id = Integer.parseInt(matcher.replaceAll("").trim());
    }
}
//━━━━━━神兽出没━━━━━━
//　　  ┏┓　    ┏┓
//　　 ┏┛┻━━━━━━┛┻┓
//　　 ┃　　　　　 ┃
//　　 ┃　　　━　　┃
//　　 ┃　┳┛　┗┳　 ┃
//　　 ┃　　　　　 ┃
//　　 ┃　　┻　　  ┃
//　　 ┃　　　　　 ┃
//　　 ┗━┓　　　┏━┛           Code is far away from bug with the animal protecting
//　　　　┃　　　┃                         神兽保佑,代码无bug
//　　　　┃　　　┃
//　　　　┃　　　┗━━━┓
//　　　　┃　　　　　 ┣┓
//　　　　┃　　　　　 ┏┛
//　　　　┗┓┓┏━┳┓┏┛
//　　　　 ┃┫┫ ┃┫┫
//　　　　 ┗┻┛ ┗┻┛
