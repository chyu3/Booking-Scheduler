import java.util.ArrayList;
//definition of one Class

public class Class {
    ArrayList<Student> students;
    private static int counter = 0;
    private int ClassCode; //A Number that represents one class


    //new class
    public Class() {
        counter++;
        ClassCode = counter;
        //count how many classes
        //for (i = 1; i < number of classes; i++)
            //a = a + i;
    }


    //load all classes first
    public Class(int classCode) {
        ClassCode = classCode;

        //Count from existing Classes
        counter = classCode;
    }



    public int getClassSize()
    {
        return students.size();
    }

    public String toString()
    {
        return "Class code: " + getClassCode();
    }

    public static void main (String[] args) {

    }

    public int getClassCode() {
        return ClassCode;
    }
}
