package cn.edu.zjnu.AutoGenPaperSystem.model;

/**
 * Created by sgt on 2016/9/29.
 */
public class QuestionsJson {
    private int id;
    private String context;
    private String answer;

    public QuestionsJson() {
    }

    public QuestionsJson(int id, String context, String answer) {
        this.id = id;
        this.context = context;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
