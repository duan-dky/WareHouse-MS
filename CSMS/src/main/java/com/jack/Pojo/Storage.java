package com.jack.Pojo;

public class Storage {
    private String whcode;//仓库号
    private String whname;//仓库名
    private String address;//仓库地址
    private int snum;//小型货架余量
    private int mnum;//中型货架余量
    private int bnum;//大型货架余量

    public Storage() {
    }

    public Storage(String whcode, String whname, String address, int snum, int mnum, int bnum) {
        this.whcode = whcode;
        this.whname = whname;
        this.address = address;
        this.snum = snum;
        this.mnum = mnum;
        this.bnum = bnum;
    }

    public String getWhcode() {
        return whcode;
    }

    public void setWhcode(String whcode) {
        this.whcode = whcode;
    }

    public String getWhname() {
        return whname;
    }

    public void setWhname(String whname) {
        this.whname = whname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    public int getMnum() {
        return mnum;
    }

    public void setMnum(int mnum) {
        this.mnum = mnum;
    }

    public int getBnum() {
        return bnum;
    }

    public void setBnum(int bnum) {
        this.bnum = bnum;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "whcode='" + whcode + '\'' +
                ", whname='" + whname + '\'' +
                ", address='" + address + '\'' +
                ", snum=" + snum +
                ", mnum=" + mnum +
                ", bnum=" + bnum +
                '}';
    }
}
