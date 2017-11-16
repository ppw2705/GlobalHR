package com.geeconsystems.globalhr.model;


public class leavequotacc {
    String person,leave,datet,date,allocateddays,dayno,taken,takenno,balance,balno;

    public leavequotacc(String person, String leave, String datet, String date, String allocateddays, String dayno, String taken, String takenno, String balance, String balno) {
        this.person = person;
        this.leave = leave;
        this.datet = datet;
        this.date = date;
        this.allocateddays = allocateddays;
        this.dayno = dayno;
        this.taken = taken;
        this.takenno = takenno;
        this.balance = balance;
        this.balno = balno;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getDatet() {
        return datet;
    }

    public void setDatet(String datet) {
        this.datet = datet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAllocateddays() {
        return allocateddays;
    }

    public void setAllocateddays(String allocateddays) {
        this.allocateddays = allocateddays;
    }

    public String getDayno() {
        return dayno;
    }

    public void setDayno(String dayno) {
        this.dayno = dayno;
    }

    public String getTaken() {
        return taken;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }

    public String getTakenno() {
        return takenno;
    }

    public void setTakenno(String takenno) {
        this.takenno = takenno;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalno() {
        return balno;
    }

    public void setBalno(String balno) {
        this.balno = balno;
    }
}
