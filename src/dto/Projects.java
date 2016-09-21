package dto;

import java.io.Serializable;
import java.sql.Date;

public class Projects implements Serializable {
    private String id;
    private String projectName;
    private String customer_id;
    private Date createdAt;
    private Date updatedAt;

    public Projects() {

    }

    public Projects(String id, String projectName, String customer_id,
            Date createdAt, Date updatedAt) {
        super();
        this.id = id;
        this.projectName = projectName;
        this.customer_id = customer_id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_id() {
        return this.customer_id;
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