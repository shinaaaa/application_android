package com.example.kim.career.school;

public class school_list {
    private String campusName;  //캠퍼스 명
    private String schoolGubun;  //학교 종류
    private String adres;   //주소
    private String schoolName;  //학교 명
    private String estType; //설립유형
    private String link;    //링크

    public school_list(String campusName, String schoolGubun, String adres, String schoolName, String estType, String link) {
        this.campusName = campusName;
        this.schoolGubun = schoolGubun;
        this.adres = adres;
        this.schoolName = schoolName;
        this.estType = estType;
        this.link = link;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getSchoolGubun() {
        return schoolGubun;
    }

    public void setSchoolGubun(String schoolGubun) {
        this.schoolGubun = schoolGubun;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getEstType() {
        return estType;
    }

    public void setEstType(String estType) {
        this.estType = estType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "school_list{" +
                "campusName='" + campusName + '\'' +
                ", schoolGubun='" + schoolGubun + '\'' +
                ", adres='" + adres + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", estType='" + estType + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
