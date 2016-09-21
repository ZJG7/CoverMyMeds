package dto;

import java.io.Serializable;
import java.sql.Date;

public class Tasks implements Serializable {
    private String id;
    private String projectId;
    private String userId;
    private String taskName;
    private Date createdAt;
    private Date updatedAt;

    public Tasks() {

    }

    public Tasks(String id, String projectId, String userId, String taskName,
            Date createdAt, Date updatedAt) {
        super();
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.taskName = taskName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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