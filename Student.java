import java.util.ArrayList;

//generate Students ID
public class Student {
    private String ID;  //6 characters
    private char Level;
    private int Grade; //
    private int Number = 0; //student's number
    private static int counter;  //generate ID


    //for new student ID
    public Student(int Level, char Grade, int Number, int ClassCode) {
        Number++;
        ID = "" + Level + Grade + ClassCode + String.format("%d03", Number);
    }

    //overloads above method, for existing student ID
    public Student (String ID, int Grade, char Level)
    {
        this.ID = ID;
        this.Grade = Grade;
        this.Level = Level;
    }

    //store in to a database


    public static void main (String[] args) {


    }
}
