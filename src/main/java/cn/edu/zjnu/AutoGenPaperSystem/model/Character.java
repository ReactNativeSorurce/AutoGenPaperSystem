package cn.edu.zjnu.AutoGenPaperSystem.model;

public class Character {
    private Integer charactId;

    private String charactName;

    public Character(Integer charactId, String charactName) {
        this.charactId = charactId;
        this.charactName = charactName;
    }

    public Character() {
        super();
    }

    public Integer getCharactId() {
        return charactId;
    }

    public void setCharactId(Integer charactId) {
        this.charactId = charactId;
    }

    public String getCharactName() {
        return charactName;
    }

    public void setCharactName(String charactName) {
        this.charactName = charactName == null ? null : charactName.trim();
    }
}