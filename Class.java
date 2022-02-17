import java.util.*;
//definition of one Class

public class Class {
    //arraylist of students in one class
    ArrayList<Student> students = new ArrayList<>();
    //private static int counter = 0;  //automatic
    private String ClassCode;
    private char ClassLevel;
    private int ClassGrade;
    private int ClassIndex;
    private Teacher classSize; //=Teacher getClasses();

    //new class, teacher inputs all information
    public Class(char level, int grade, int index) {
        //ClassCode = Level/Grade/Index
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", index); //Automatic counter assigns a number to the class
        students = new ArrayList<>();
    }

    public Class() {

    }

    public Class(char level, int grade) {
    }

    public String toString()
    {
        return "Class code: " + getClassCode();
    }

    public String getClassCode() {
        return ClassCode;
    }

    public void setClassCode(String classCode) {
        ClassCode = classCode;
    }

    public char getClassLevel() {
        return ClassLevel;
    }

    public void setClassLevel(char classLevel) {
        ClassLevel = classLevel;
    }

    public int getClassGrade() {
        return ClassGrade;
    }

    public void setClassGrade(int classGrade) {
        ClassGrade = classGrade;
    }

    public int getClassIndex() {
        return ClassIndex;
    }

    public void setClassIndex(int classIndex) {
        ClassIndex = classIndex;
    }

    public Teacher getClassSize() {
        return classSize;
    }

    public void setClassSize(Teacher classSize) {
        this.classSize = classSize;
    }
}
