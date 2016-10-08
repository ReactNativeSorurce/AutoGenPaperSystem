package cn.edu.zjnu.AutoGenPaperSystem.model;

public class Knowledge {
    private Integer knowledgeId;

    private String knowledgeName;

    private Integer subjectId;

    private Integer superiorId;

    public Knowledge(Integer knowledgeId, String knowledgeName, Integer subjectId, Integer superiorId) {
        this.knowledgeId = knowledgeId;
        this.knowledgeName = knowledgeName;
        this.subjectId = subjectId;
        this.superiorId = superiorId;
    }

    public Knowledge() {
        super();
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName == null ? null : knowledgeName.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(Integer superiorId) {
        this.superiorId = superiorId;
    }

    @Override
    public String toString() {
        return "Knowledge{" +
                "knowledgeId=" + knowledgeId +
                ", knowledgeName='" + knowledgeName + '\'' +
                ", subjectId=" + subjectId +
                ", superiorId=" + superiorId +
                '}';
    }
}