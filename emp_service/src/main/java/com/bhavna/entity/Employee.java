package com.bhavna.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private Long empId;
    private String name;
    private  String phone;

    List<Contact> contacts = new ArrayList<>();

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(Long empId, String name, String phone) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
    }

    public Employee(Long empId, String name, String phone, List<Contact> contacts) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public Employee() {
    }
}
