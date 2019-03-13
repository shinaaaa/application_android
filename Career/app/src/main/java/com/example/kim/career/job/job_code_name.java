package com.example.kim.career.job;

public class job_code_name {
    private String jobdicSeq;   //직업 코드 ID
    private String job; //직업명

    public job_code_name(String jobdicSeq, String job) {
        this.jobdicSeq = jobdicSeq;
        this.job = job;
    }

    public String getJobdicSeq() {
        return jobdicSeq;
    }

    public void setJobdicSeq(String jobdicSeq) {
        this.jobdicSeq = jobdicSeq;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "job_code_name{" +
                "jobdicSeq='" + jobdicSeq + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
