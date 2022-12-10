package com.jack.Controller;

public class StorageRest {
    private String id;
    private int num;

    public StorageRest() {
    }

    public StorageRest(String id, int num) {
        this.id = id;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "StorageRest{" +
                "id='" + id + '\'' +
                ", num=" + num +
                '}';
    }
}
