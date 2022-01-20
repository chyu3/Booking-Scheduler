import java.util.*;
//definition of one Class

public class Class {
    ArrayList<Student> students = new ArrayList<>();
    private static int counter = 0;  //automatic
    private String ClassCode;
    private Teacher classSize; //=Teacher getClasses();

    //new class
    public Class(char level, int grade) {
        counter++;
        //ClassCode = Level/Grade/Index
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", counter); //Automatic counter assigns a number to the class
        students = new ArrayList<>();
    }

    //load all classes first
    public Class(String index) {
        ClassCode = index;

        //Count from existing Classes
        counter = Integer.parseInt(index.substring(index.length()-2));
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
