package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Integer cust_id;

    @Column (name = "name")
    private String name;

    public User(Integer cust_id, String name) {
        this.cust_id = cust_id;
        this.name = name;
    }

    public User(){
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
