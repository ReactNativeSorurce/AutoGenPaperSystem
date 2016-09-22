package cn.edu.zjnu.AutoGenPaperSystem.model;

public class Subject {
    private Integer subjectId;

    private String subjectName;

    private Integer gradeId;

    public Subject(Integer subjectId, String subjectName, Integer gradeId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeId = gradeId;
    }

    public Subject() {
        super();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }
}