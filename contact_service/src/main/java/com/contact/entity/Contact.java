package com.contact.entity;

public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long empId;

    public Contact(Long cId, String email, String contactName, Long empId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.empId = empId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }
}
