package de.htw.learning_by_questing;

public class QuestEntity {
    private String title;
    private String module;
    private String status;
    private int xp;
    private String createdBy;

    public QuestEntity(String title, String module, String status, int xp, String createdBy) {
        this.title = title;
        this.module = module;
        this.status = status;
        this.xp = xp;
        this.createdBy = createdBy;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getModule() {return module;}
    public void setModule(String module) {this.module = module;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public int getXp() {return xp;}
    public void setXp(int xp) {this.xp = xp;}

    public String getCreatedBy() {return createdBy;}
    public void setCreatedBy(String createdBy) {this.createdBy = createdBy;}
}
