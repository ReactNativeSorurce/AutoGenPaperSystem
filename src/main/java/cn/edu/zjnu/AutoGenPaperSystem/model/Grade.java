package cn.edu.zjnu.AutoGenPaperSystem.model;

public class Grade {
    private Integer cradeId;

    private String cradeName;

    public Grade(Integer cradeId, String cradeName) {
        this.cradeId = cradeId;
        this.cradeName = cradeName;
    }

    public Grade() {
        super();
    }

    public Integer getCradeId() {
        return cradeId;
    }

    public void setCradeId(Integer cradeId) {
        this.cradeId = cradeId;
    }

    public String getCradeName() {
        return cradeName;
    }

    public void setCradeName(String cradeName) {
        this.cradeName = cradeName == null ? null : cradeName.trim();
    }
}