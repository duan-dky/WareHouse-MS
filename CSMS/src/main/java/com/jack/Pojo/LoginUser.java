package com.jack.Pojo;

public class LoginUser {
    private String id;//账号
    private String passwd;//密码
    private String email;//邮箱
    private int idtype;//用户类型

    public LoginUser() {
    }

    public LoginUser(String id, String passwd, String email, int idtype) {
        this.id = id;
        this.passwd = passwd;
        this.email = email;
        this.idtype = idtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id='" + id + '\'' +
                ", passwd='" + passwd + '\'' +
                ", email='" + email + '\'' +
                ", idtype=" + idtype +
                '}';
    }
}
