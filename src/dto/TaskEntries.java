package dto;

import java.io.Serializable;
import java.sql.Date;

public class TaskEntries implements Serializable {
    private String id;
    private String taskId;
    private String duration;
    private String note;
    private Date startTime;
    private Date createdAt;
    private Date updatedAt;

    public TaskEntries() {

    }

    public TaskEntries(String id, String taskId, String duration, String note,
            Date startTime, Date createdAt, Date updatedAt) {
        super();
        this.id = id;
        this.taskId = taskId;
        this.duration = duration;
        this.note = note;
        this.startTime = startTime;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
