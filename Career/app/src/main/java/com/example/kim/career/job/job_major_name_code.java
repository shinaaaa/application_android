package com.example.kim.career.job;

public class job_major_name_code {
    private String MAJOR_NM;    //학과명
    private String MAJOR_SEQ;   //학과코드

    public job_major_name_code(String MAJOR_NM, String MAJOR_SEQ) {
        this.MAJOR_NM = MAJOR_NM;
        this.MAJOR_SEQ = MAJOR_SEQ;
    }

    public String getMAJOR_NM() {
        return MAJOR_NM;
    }

    public void setMAJOR_NM(String MAJOR_NM) {
        this.MAJOR_NM = MAJOR_NM;
    }

    public String getMAJOR_SEQ() {
        return MAJOR_SEQ;
    }

    public void setMAJOR_SEQ(String MAJOR_SEQ) {
        this.MAJOR_SEQ = MAJOR_SEQ;
    }

    @Override
    public String toString() {
        return "job_major_name_code{" +
                "MAJOR_NM='" + MAJOR_NM + '\'' +
                ", MAJOR_SEQ='" + MAJOR_SEQ + '\'' +
                '}';
    }
}
