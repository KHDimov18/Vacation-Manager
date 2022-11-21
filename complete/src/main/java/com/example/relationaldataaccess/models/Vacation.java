package com.example.servingwebcontent.models;

public class Vacation {
    private datetime startDate, endDate, dateOfRequest;
    private Boolean halfDayVacation, approved;
    private String applicant;

    public Vacation(datetime startDate, datetime endDate, datetime dateOfRequest, Boolean halfDayVacation, Boolean approved, String applicant) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateOfRequest = dateOfRequest;
        this.halfDayVacation = halfDayVacation;
        this.approved = approved;
        this.applicant = applicant;
    }

    public Vacation() {}

    @java.lang.Override
    public java.lang.String toString() {
        return "Vacation{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", dateOfRequest='" + dateOfRequest + '\'' +
                ", halfDayVacation=" + halfDayVacation +
                ", approved=" + approved +
                ", applicant='" + applicant + '\'' +
                '}';
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(datetime startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(datetime endDate) {
        this.endDate = endDate;
    }

    public String getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(datetime dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Boolean getHalfDayVacation() {
        return halfDayVacation;
    }

    public void setHalfDayVacation(Boolean halfDayVacation) {
        this.halfDayVacation = halfDayVacation;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
}
