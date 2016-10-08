package cn.edu.zjnu.AutoGenPaperSystem.model;

/**
 * Created by zseapeng on 2016/9/29.
 */
public class TypesJson {
    private String name;
    private String url;

    public TypesJson(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public TypesJson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TypesJson{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
