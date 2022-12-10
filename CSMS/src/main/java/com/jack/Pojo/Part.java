package com.jack.Pojo;

import java.sql.Timestamp;

public class Part {
    private String pcode;//配件号
    private String pname;//配件名
    private String ptype;//配件类型
    private String manufacture;//生产商
    private Timestamp protime;//生产日期
    private int Warrantytime;//保修期
    private String info;//详细信息
    private int size;//规格

    public Part() {
    }

    public Part(String pcode, String pname, String ptype, String manufacture, Timestamp protime, int warrantytime, String info, int size) {
        this.pcode = pcode;
        this.pname = pname;
        this.ptype = ptype;
        this.manufacture = manufacture;
        this.protime = protime;
        Warrantytime = warrantytime;
        this.info = info;
        this.size = size;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Timestamp getProtime() {
        return protime;
    }

    public void setProtime(Timestamp protime) {
        this.protime = protime;
    }

    public int getWarrantytime() {
        return Warrantytime;
    }

    public void setWarrantytime(int warrantytime) {
        Warrantytime = warrantytime;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return "Part{" +
                "pcode='" + pcode + '\'' +
                ", pname='" + pname + '\'' +
                ", ptype='" + ptype + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", protime=" + protime +
                ", Warrantytime=" + Warrantytime +
                ", info='" + info + '\'' +
                ", size=" + size +
                '}';
    }
}
