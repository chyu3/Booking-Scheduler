import java.util.*;

//generate Students ID

public class Student {
    private String ID;  //7 characters, first 4 index = classCode, last 3 index = number
    //private char Level;
    private int Grade;
    //private int Number = 0; //student's number
    //private static int counter;  //generate ID

    //overloads above method, for existing student ID
    public Student (String ID, int Grade)
    {
        this.ID = ID;
        this.Grade = Grade;
    }

    public Student(char level, int grade, String classCode) {
    }

    public static void main (String[] args) {


    }
}
