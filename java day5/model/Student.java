package com.Day4.model;

public class Student extends Branch{
    private String studentName;
    private String usn;

    public Student(String name, String id, String place, String branchName, String branchID, String studentName, String usn) {
        super(name, id, place, branchName, branchID);
        this.studentName = studentName;
        this.usn = usn;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\nstudentName='" + studentName + '\'' +
                ",\nusn=" + usn +
                super.toString()+
                '}';
    }
}
