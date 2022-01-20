import java.util.ArrayList;

//generate Students ID
public class Student
{
    private String ID;  //7 characters, first 4 index = classCode, last 3 index = number
    //private char Level;
    private int Grade;
    //private int Number = 0; //student's number
    private static int counter;  //generate ID

    //overloads above method, for existing student ID
    public Student(String classCode, char level, int Grade)
    {
        counter++;
        this.ID = classCode + String.format("%03d", counter);
        this.Grade = Grade;
    }
    public Student(String ID, int Grade)
    {
        this.ID = ID;
        this.Grade = Grade;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public int getGrade()
    {
        return Grade;
    }

    public void setGrade(int grade)
    {
        Grade = grade;
    }

    // polymorphism
    @java.lang.Override
    public java.lang.String toString()
    {
        return "Student ID: " + ID + "\tStudent Grade=" + Grade;
    }
}
