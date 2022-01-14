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

    public static ArrayList<Student> student = new ArrayList<Student>();

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

        Student newStudent = new Student(level, grade, index);
        student.add(newStudent);
        save();
    }

    //change level, grade, index, number
    public static void editStudent(){
        //find ID
        //new input

    }
    public static void main(String[] args){

    }

    //save to database
    public static void save() throws IOException {
        System.out.println("<<< Saving data >>>");
        File studentFile = new File("student.txt");
        FileWriter fw = new FileWriter(studentFile);
        PrintWriter out = new PrintWriter(fw);	// write mode
        for (Student s : student)  //loop to save each element ->
        {
            out.println(s.getLevel());//of the list to the file
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
            System.out.println("Data file not found. Creating one.");
            newStudent();
        }
    }
}
