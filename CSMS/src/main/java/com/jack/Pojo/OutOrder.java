package com.jack.Pojo;

import java.sql.Timestamp;

public class OutOrder {
    private String ocode;//订单号
    private String pcode;//配件号
    private String rcode;//仓库号
    private int num;//数量
    private Timestamp otime;//出库时间
    private String ucode;//处理人工号

    public OutOrder() {
    }

    public OutOrder(String ocode, String pcode, String rcode, int num, Timestamp otime, String ucode) {
        this.ocode = ocode;
        this.pcode = pcode;
        this.rcode = rcode;
        this.num = num;
        this.otime = otime;
        this.ucode = ucode;
    }

    public String getOcode() {
        return ocode;
    }

    public void setOcode(String ocode) {
        this.ocode = ocode;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Timestamp getOtime() {
        return otime;
    }

    public void setOtime(Timestamp otime) {
        this.otime = otime;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    @Override
    public String toString() {
        return "OutOrder{" +
                "ocode='" + ocode + '\'' +
                ", pcode='" + pcode + '\'' +
                ", rcode='" + rcode + '\'' +
                ", num=" + num +
                ", otime=" + otime +
                ", ucode='" + ucode + '\'' +
                '}';
    }
}
