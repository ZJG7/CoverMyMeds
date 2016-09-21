package dto;

import java.io.Serializable;
import java.sql.Date;

public class Customers implements Serializable {
    private String id;
    private String company;
    private String address;
    private String city;
    private String state;
    private String zip;
    private Date createdAt;
    private Date updatedAt;

    public Customers() {

    }

    public Customers(String id, String company, String address, String city,
            String state, String zip, Date createdAt, Date updatedAt) {
        super();
        this.id = id;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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