package com.jack.Pojo;

public class Order {
    private String pcode;
    private int num;
    private String rcode;
    private String stype;
    private String ucode;

    public Order() {
    }

    public Order(int num,String pcode, String rcode) {
        this.pcode = pcode;
        this.num = num;
        this.rcode = rcode;
    }

    public Order(String pcode, int num, String rcode, String stype, String ucode) {
        this.pcode = pcode;
        this.num = num;
        this.rcode = rcode;
        this.stype = stype;
        this.ucode = ucode;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }


    @Override
    public String toString() {
        return "Order{" +
                "pcode='" + pcode + '\'' +
                ", num=" + num +
                ", rcode='" + rcode + '\'' +
                ", stype='" + stype + '\'' +
                ", ucode='" + ucode + '\'' +
                '}';
    }
}
