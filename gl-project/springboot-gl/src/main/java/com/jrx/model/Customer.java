package com.jrx.model;

public class Customer {
    private Integer custId;

    private String surname;

    private String gender;

    private String educaDes;

    private String marDes;

    private Integer birthday;

    private String address;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEducaDes() {
        return educaDes;
    }

    public void setEducaDes(String educaDes) {
        this.educaDes = educaDes == null ? null : educaDes.trim();
    }

    public String getMarDes() {
        return marDes;
    }

    public void setMarDes(String marDes) {
        this.marDes = marDes == null ? null : marDes.trim();
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}