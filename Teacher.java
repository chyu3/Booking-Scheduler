import java.util.*;

public class Teacher {
    // will this class define a teacher? e.g. teacher name, id, classroom, etc.?
    private String teacherName;
    private String classRoom;
    public ArrayList<Class> classes; //for multiple teachers, public for easy access

    //teacher manager (to manage the class arraylist)
    //teacher will input the classes

    public Teacher()    // empty constructor
    {
        this.classes = new ArrayList<Class>();
    }

    public Teacher(String teacherName, ArrayList<Class> classes)
    {
        this.teacherName = teacherName;
        this.classes = classes;
    }

    public Teacher(String teacherName, String classRoom, ArrayList<Class> classes)
    {
        this.teacherName = teacherName;
        this.classRoom = classRoom;
        this.classes = classes;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public ArrayList<Class> getClasses()
    {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes)
    {
        this.classes = classes;
    }

    public int getHowManyClasses()
    {
        return classes.size();
    }

    @Override
    public String toString()
    {
        return "Teacher Name: " + teacherName + "\nClasses: " + classes;
    }
}
