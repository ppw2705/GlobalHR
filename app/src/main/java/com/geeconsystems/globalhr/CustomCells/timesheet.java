package com.geeconsystems.globalhr.CustomCells;

public class timesheet  {
    private String Quertyadmin,status,tsperiod,timesheet,sded,dte;

    public timesheet(String quertyadmin, String status, String tsperiod, String timesheet, String sded, String dte) {
        Quertyadmin = quertyadmin;
        this.status = status;
        this.tsperiod = tsperiod;
        this.timesheet = timesheet;
        this.sded = sded;
        this.dte = dte;
    }

    public String getQuertyadmin() {
        return Quertyadmin;
    }

    public void setQuertyadmin(String quertyadmin) {
        Quertyadmin = quertyadmin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTsperiod() {
        return tsperiod;
    }

    public void setTsperiod(String tsperiod) {
        this.tsperiod = tsperiod;
    }

    public String getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(String timesheet) {
        this.timesheet = timesheet;
    }

    public String getSded() {
        return sded;
    }

    public void setSded(String sded) {
        this.sded = sded;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }
}
