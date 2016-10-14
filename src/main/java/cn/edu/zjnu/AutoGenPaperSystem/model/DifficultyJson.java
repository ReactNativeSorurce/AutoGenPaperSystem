package cn.edu.zjnu.AutoGenPaperSystem.model;

/**
 * Created by sgt on 2016/10/14.
 */
public class DifficultyJson {

    private String name;
    private String url;

    public DifficultyJson(String describe, String url) {

        this.name = describe;
        this.url = url;
    }

    public DifficultyJson() {
    }

    @Override
    public String toString() {
        return "DifficultyJson{" +
                ", describe='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
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
}
