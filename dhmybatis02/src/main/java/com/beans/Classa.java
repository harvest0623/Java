package com.beans;

public class Classa {
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Teachera getTeachera() {
        return teachera;
    }

    public void setTeachera(Teachera teachera) {
        this.teachera = teachera;
    }

    int cid;
    String cname;
    Teachera teachera;
}