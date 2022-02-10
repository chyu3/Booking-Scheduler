/*
add student
delete student
edit student
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class StudentTest {

    public static ArrayList<Student> students = new ArrayList<Student>();

    //Making a new student to add in arraylist
    public static void newStudent() throws IOException {
        char level = IBIO.inputChar("Enter level ( H for Higher / S for Standard / P for Pre-IB ) : ");
        while (level != 'H' || level != 'S' || level != 'P') {
            System.out.println("Error");
            level = IBIO.inputChar("Enter Level ( H for Higher / S for Standard / P for Pre-IB ) : ");
        }
        int grade = IBIO.inputInt("Enter Grade  : ");
        while (grade != 11 || grade != 12) // arbitrary number, depends on requirements
        {
            grade = IBIO.inputInt("Enter '11' or '12': ");
        }
        int index = IBIO.inputInt("Enter the class number : ");
        while (index <= 0 || grade >= 11)
        {
            index = IBIO.inputInt("Enter a valid class number (1-10): ");
        }

        //save to the arraylist
        Student newStudent = new Student(level, grade, index);
        students.add(newStudent);
        //save to a file
        save();
    }

    public static int searchByID(String id)
    {
        for (int i = 0; i< students.size(); i++){
            if (students.get(i).getID().equals(id)){
                return i;
            }
        }
        return -1;
    }

    //change level, grade, index, number
    public static void editStudent(char level, int grade, int index){
        //find ID
        String id = IBIO.inputString("Enter the Student ID: ");
        do {


        } while(id.equalsIgnoreCase("") == true);
        //new input

        Student New = new Student( level,  grade,  index);

    }

    public static void delete (char Level, int Grade, int Index){
        //student number input to be reconsidered
        //as less likely to be memorized by teacher


    }
    /*public static void delete(ClassCode classCode)
    {
        for (int i = 0; i < classes.size(); i++)
        {
            Class currentClass = classes.get(i);
            String currentClassCode = currentClass.getClassCode();
            if(currentClassCode.equals(classCode))
            {
                System.out.println("Searching success! Continue to delete " + currentClassCode);
                if(confirm() == true)
                {

                }
            }
        }
     }
    */

    //save to a file
    public static void save() throws IOException {
        System.out.println("<<< Saving data >>>");
        File studentFile = new File("student.txt");
        FileWriter fw = new FileWriter(studentFile);
        PrintWriter out = new PrintWriter(fw);
        for (Student s : students)  //save each element
        {
            out.println(s.getLevel());
            out.println(s.getGrade());
            out.println(s.getIndex());
            out.println(s.getNumber());
        }
        out.close();
        System.out.println("Data file saved."); // optional
    }

    public void check() throws IOException {
        System.out.println("<<< Loading data >>>");
        File studentFile = new File("student.txt");
        if (!studentFile.exists())
        {
            studentFile.createNewFile();
            char add = IBIO.inputChar("Data file not found. Create a Student?");
            add = Character.toUpperCase(add);
            if (add == 'Y')
            {
                newStudent();
                save();
            }
            else return;
        }
    }

    //search and list students by entering the level
    public static void listStudents(char Level){
        char currentStudent;
        for (Student A: students){
            currentStudent = Character.toUpperCase( A.getLevel() );
            if ( currentStudent == Character.toUpperCase(Level) ){
                System.out.println(A);
            }
        }
    }

}
