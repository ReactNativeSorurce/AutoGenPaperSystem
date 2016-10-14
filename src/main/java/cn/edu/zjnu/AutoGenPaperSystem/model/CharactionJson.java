package cn.edu.zjnu.AutoGenPaperSystem.model;

/**
 * Created by sgt on 2016/10/14.
 */
public class CharactionJson {
    private String name;
    private String url;

    public CharactionJson() {
    }

    public CharactionJson(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return "CharactionJson{" +
                "name='" + name + '\'' +
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
