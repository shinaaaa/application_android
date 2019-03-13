package com.example.kim.career.major;

public class major_list {
    private String mClass;  //학과
    private String majorSeq;    //학과코드

    public major_list(String mClass, String majorSeq) {
        this.mClass = mClass;
        this.majorSeq = majorSeq;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getMajorSeq() {
        return majorSeq;
    }

    public void setMajorSeq(String majorSeq) {
        this.majorSeq = majorSeq;
    }

    @Override
    public String toString() {
        return "major_list{" +
                "mClass='" + mClass + '\'' +
                ", majorSeq='" + majorSeq + '\'' +
                '}';
    }
}
