package cn.edu.zjnu.AutoGenPaperSystem.model;

public class Questions {
    private Integer questionsId;

    private String content;

    private Integer subjectId;

    private Integer knowledgeId1;

    private Integer knowledgeId2;

    private Integer knowledgeId3;

    private Integer knowledgeId4;

    private Integer typeId;

    private Integer difficultyId;

    private Integer charactId;

    private Boolean isdelete;

    private String Answer;


    public Questions(Integer questionsId, String content, Integer subjectId, Integer knowledgeId1, Integer knowledgeId2, Integer knowledgeId3, Integer knowledgeId4, Integer typeId, Integer difficultyId, Integer charactId, Boolean isdelete, String answer) {
        this.questionsId = questionsId;
        this.content = content;
        this.subjectId = subjectId;
        this.knowledgeId1 = knowledgeId1;
        this.knowledgeId2 = knowledgeId2;
        this.knowledgeId3 = knowledgeId3;
        this.knowledgeId4 = knowledgeId4;
        this.typeId = typeId;
        this.difficultyId = difficultyId;
        this.charactId = charactId;
        this.isdelete = isdelete;
        Answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionsId=" + questionsId +
                ", content='" + content + '\'' +
                ", subjectId=" + subjectId +
                ", knowledgeId1=" + knowledgeId1 +
                ", knowledgeId2=" + knowledgeId2 +
                ", knowledgeId3=" + knowledgeId3 +
                ", knowledgeId4=" + knowledgeId4 +
                ", typeId=" + typeId +
                ", difficultyId=" + difficultyId +
                ", charactId=" + charactId +
                ", isdelete=" + isdelete +
                ", Answer='" + Answer + '\'' +
                '}';
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public Questions() {
        super();
    }

    public Integer getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(Integer questionsId) {
        this.questionsId = questionsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getKnowledgeId1() {
        return knowledgeId1;
    }

    public void setKnowledgeId1(Integer knowledgeId1) {
        this.knowledgeId1 = knowledgeId1;
    }

    public Integer getKnowledgeId2() {
        return knowledgeId2;
    }

    public void setKnowledgeId2(Integer knowledgeId2) {
        this.knowledgeId2 = knowledgeId2;
    }

    public Integer getKnowledgeId3() {
        return knowledgeId3;
    }

    public void setKnowledgeId3(Integer knowledgeId3) {
        this.knowledgeId3 = knowledgeId3;
    }

    public Integer getKnowledgeId4() {
        return knowledgeId4;
    }

    public void setKnowledgeId4(Integer knowledgeId4) {
        this.knowledgeId4 = knowledgeId4;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getDifficultyId() {
        return difficultyId;
    }

    public void setDifficultyId(Integer difficultyId) {
        this.difficultyId = difficultyId;
    }

    public Integer getCharactId() {
        return charactId;
    }

    public void setCharactId(Integer charactId) {
        this.charactId = charactId;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}