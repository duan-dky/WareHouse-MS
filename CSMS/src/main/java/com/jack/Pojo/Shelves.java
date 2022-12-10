package com.jack.Pojo;

public class Shelves {
    private String scode;//货架号
    private String stype;//货架类型
    private int snum;//货架容量

    public Shelves() {
    }

    public Shelves(String scode, String stype, int snum) {
        this.scode = scode;
        this.stype = stype;
        this.snum = snum;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    @Override
    public String toString() {
        return "Shelves{" +
                "scode='" + scode + '\'' +
                ", stype='" + stype + '\'' +
                ", snum=" + snum +
                '}';
    }
}
