package com.example.practice;

public class HelperClass1 {
   String skill;
   String spin;
   String des;
   String mail;
    public HelperClass1(String m,String n,String s,String d){
        this.skill=n;
        this.spin=s;
        this.des=d;
        this.mail =m;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getSpin() {
        return spin;
    }

    public void setSpin(String spin) {
        this.spin = spin;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
