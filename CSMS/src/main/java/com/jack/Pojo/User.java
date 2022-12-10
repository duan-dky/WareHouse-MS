package com.jack.Pojo;

public class User {
    private String ucode;//工号
    private String rcode;//仓库号
    private String uname;//姓名
    private String phone;//联系电话

    public User() {
    }

    public User(String ucode, String rcode, String uname, String phone) {
        this.ucode = ucode;
        this.rcode = rcode;
        this.uname = uname;
        this.phone = phone;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "ucode='" + ucode + '\'' +
                ", rcode='" + rcode + '\'' +
                ", uname='" + uname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
