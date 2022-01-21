import java.util.*;
//definition of one Class

public class Class {
    ArrayList<Student> students = new ArrayList<>();
    //private static int counter = 0;  //automatic
    private String ClassCode;
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

    public int getClassSize()
    {
        return students.size();
    }

    public String toString()
    {
        return "Class code: " + getClassCode();
    }

    public String getClassCode() { return ClassCode; }
}
