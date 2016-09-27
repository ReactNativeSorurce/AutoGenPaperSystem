package cn.edu.zjnu.AutoGenPaperSystem.model;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/26.
 */
public class SubJson {
    private String name;
    private List contextList;

    public SubJson(String name, List contextList) {
        this.name = name;
        this.contextList = contextList;
    }

    public SubJson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getContextList() {
        return contextList;
    }

    public void setContextList(List contextList) {
        this.contextList = contextList;
    }
}
