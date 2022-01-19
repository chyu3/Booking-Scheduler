import java.util.*;
//definition of one Class

public class Class {
    ArrayList<Student> students = nre ArrayList<>();
    private static int counter = 0;
    private String ClassCode; //A Number that represents one class


    //new class
    public Class(char level, int grade) {
        counter++;
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", counter);
        //count how many classes
        //for (i = 1; i < number of classes; i++)
            //a = a + i;
        students = new ArrayList<>();
    }

    //load all classes first
    public Class(String classCode) {
        ClassCode = classCode;

        //Count from existing Classes
        counter = Integer.parseInt(classCode.substring(classCode.length()-2));
        students = new ArrayList<>();
    }

    public Class() {

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
