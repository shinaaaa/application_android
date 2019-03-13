package com.example.kim.career.job;

public class job_detail {

    private String summary; //직업 설명
    private String similarJob;  //유사 직업
    private String aptitude;    //적성및흥미
    private String ability; //핵심능력
    private String job; //직업명
    private String empway; //입적 및 취업방법
    private String employment;  //고용현황
    private String salery;  //임금수준
    private String capacity;    //관련자격증
    private String possibility; //발전가능성

    public job_detail(String summary, String similarJob, String aptitude, String ability, String job, String empway, String employment, String salery, String capacity, String possibility) {
        this.summary = summary;
        this.similarJob = similarJob;
        this.aptitude = aptitude;
        this.ability = ability;
        this.job = job;
        this.empway = empway;
        this.employment = employment;
        this.salery = salery;
        this.capacity = capacity;
        this.possibility = possibility;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPossibility() {
        return possibility;
    }

    public void setPossibility(String possibility) {
        this.possibility = possibility;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSimilarJob() {
        return similarJob;
    }

    public void setSimilarJob(String similarJob) {
        this.similarJob = similarJob;
    }

    public String getAptitude() {
        return aptitude;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmpway() {
        return empway;
    }

    public void setEmpway(String empway) {
        this.empway = empway;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getSalery() {
        return salery;
    }

    public void setSalery(String salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "job_detail{" +
                "summary='" + summary + '\'' +
                ", similarJob='" + similarJob + '\'' +
                ", aptitude='" + aptitude + '\'' +
                ", ability='" + ability + '\'' +
                ", job='" + job + '\'' +
                ", empway='" + empway + '\'' +
                ", employment='" + employment + '\'' +
                ", salery='" + salery + '\'' +
                ", capacity='" + capacity + '\'' +
                ", possibility='" + possibility + '\'' +
                '}';
    }
}
