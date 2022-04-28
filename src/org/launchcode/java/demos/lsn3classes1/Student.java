package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {
        return name;
    }
    public void setName(String aName) {
    name = aName;
    }

    public int getStudentId() {
        return studentId;
    }
public void setStudentId(Integer aStudentId){
    studentId = aStudentId;
}

public int getNumberOfCredits() {
        return numberOfCredits;
}

public void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
}
public double getGpa(){
        return gpa;
}

public void setGpa(Double aGpa){
        gpa = aGpa;
}
}