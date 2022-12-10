package com.jack.Pojo;

public class Part_Pos {
    private String pcode;
    private String rcode;
    private String scode;
    private int num;
    private String stype;

    public Part_Pos() {
    }

    public Part_Pos(String pcode, String rcode, String scode, int num, String stype) {
        this.pcode = pcode;
        this.rcode = rcode;
        this.scode = scode;
        this.num = num;
        this.stype = stype;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    @Override
    public String toString() {
        return "Part_Pos{" +
                "pcode='" + pcode + '\'' +
                ", rcode='" + rcode + '\'' +
                ", scode='" + scode + '\'' +
                ", num=" + num +
                ", stype='" + stype + '\'' +
                '}';
    }
}
