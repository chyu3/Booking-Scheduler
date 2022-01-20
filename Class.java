import java.util.ArrayList;
//definition of one Class

public class Class
{
    private static int counter = 0;
    private String ClassCode; //A Number that represents one class
    public ArrayList<Student> students; // public for easy access
/*
    public Class() // empty constructor
    {
        students = new ArrayList<Student>();
    }
 */
    //new class
    public Class(char level, int grade)
    {
        counter++;
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", counter);
        students = new ArrayList<>();
    }

    public Class(char level, int grade, ArrayList<Student> students)
    {
        counter++;
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", counter);
        this.students =students;
    }

    //load all classes first
    public Class(String classCode)
    {
        ClassCode = classCode;

        //Count from existing Classes
        counter = Integer.parseInt(classCode.substring(classCode.length() - 2));
        students = new ArrayList<>();
    }

    public int getClassSize()
    {
        return students.size();
    }

    public String toString()
    {
        return "Class code: " + getClassCode();
    }

    public String getClassCode()
    {
        return ClassCode;
    }

    public void setClassCode(String classCode)
    {
        ClassCode = classCode;
    }
}
