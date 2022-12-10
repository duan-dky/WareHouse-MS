package com.jack.Pojo;

import java.sql.Timestamp;

public class InOrder {
    private String icode;//入库号
    private String pcode;//配件号
    private int num;//数量
    private Timestamp itime;//入库时间
    private String rcode;//仓库号
    private String stype;//货架类型
    private String ucode;//处理人工号

    public InOrder() {
    }

    public InOrder(String icode, String pcode, int num, Timestamp itime, String rcode,String stype, String ucode) {
        this.icode = icode;
        this.pcode = pcode;
        this.num = num;
        this.itime = itime;
        this.rcode = rcode;
        this.stype=stype;
        this.ucode = ucode;
    }

    public String getIcode() {
        return icode;
    }

    public void setIcode(String icode) {
        this.icode = icode;
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

    public Timestamp getItime() {
        return itime;
    }

    public void setItime(Timestamp itime) {
        this.itime = itime;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    @Override
    public String toString() {
        return "InOrder{" +
                "icode='" + icode + '\'' +
                ", pcode='" + pcode + '\'' +
                ", num=" + num +
                ", itime=" + itime +
                ", rcode='" + rcode + '\'' +
                ", stype='" + stype + '\'' +
                ", ucode='" + ucode + '\'' +
                '}';
    }
}
