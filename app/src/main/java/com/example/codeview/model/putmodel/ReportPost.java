package com.example.codeview.model.putmodel;

public class ReportPost {
    private int idReport,isAccpect,idUser,idComment;
    private String reason;

    public ReportPost(int idReport, int isAccpect, int idUser, int idComment, String reason) {
        this.idReport = idReport;
        this.isAccpect = isAccpect;
        this.idUser = idUser;
        this.idComment = idComment;
        this.reason = reason;
    }

    public int getIdReport() {
        return idReport;
    }

    public void setIdReport(int idReport) {
        this.idReport = idReport;
    }

    public int getIsAccpect() {
        return isAccpect;
    }

    public void setIsAccpect(int isAccpect) {
        this.isAccpect = isAccpect;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
