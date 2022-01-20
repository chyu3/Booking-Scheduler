import java.util.ArrayList;
//definition of one Class

public class Class
{
<<<<<<< Updated upstream
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
=======
    ArrayList<Student> students = new ArrayList<>();
    //private static int counter = 0;  //automatic
    private String ClassCode;
    private Teacher classSize; //=Teacher getClasses();

    //new class
    public Class(char level, int grade, int index)
    {
        //counter++;
        //ClassCode = Level/Grade/Index
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", index); //Automatic counter assigns a number to the class
>>>>>>> Stashed changes
        students = new ArrayList<>();
    }

    public Class(char level, int grade, ArrayList<Student> students)
    {
        counter++;
        ClassCode = Character.toUpperCase(level) + grade + String.format("%d", counter);
        this.students =students;
    }

    //load all classes first
<<<<<<< Updated upstream
    public Class(String classCode)
    {
        ClassCode = classCode;

        //Count from existing Classes
        counter = Integer.parseInt(classCode.substring(classCode.length() - 2));
=======
    public Class(String index)
    {
        ClassCode = index;
        //Count from existing Classes
        //counter = Integer.parseInt(index.substring(index.length() - 2));
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream

    public void setClassCode(String classCode)
    {
        ClassCode = classCode;
    }
=======
>>>>>>> Stashed changes
}
