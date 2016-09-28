package cn.edu.zjnu.AutoGenPaperSystem.model;

import java.util.List;

/**
 * Created by zseapeng on 2016/9/28.
 */
public class KnowledgeJson {
    private String name;
    private List contextList;
    private String url;

    public KnowledgeJson() {
    }

    public KnowledgeJson(String name, List contextList, String url) {
        this.name = name;
        this.contextList = contextList;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
