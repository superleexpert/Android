package com.al.model;

import android.util.Log;

public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    public static final String TAG = "Subject";
    private Student[] myStudents;

    // 无参构造
    public Subject() {

    }

    // 带参构造
    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.subjectName = subjectName;
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife < 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public String outputInfo(){
        String str = "subject infomation: " + this.subjectName + this.subjectNo + this.subjectLife;
        Log.d(TAG, "outputInfo: " + str);
        return str;
//        return "subject infomation: " + this.subjectName + this.subjectNo + this.subjectLife;
    }

}
