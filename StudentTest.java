/*
add student
delete student
edit student
*/

import java.io.*;
import java.util.*;

//add student, edit student

public class StudentTest {
    //Arraylist of All students
    public static ArrayList<Student> students = new ArrayList<Student>();

    //Making a new student to add in arraylist
    public static void newStudent() throws IOException {
        char level = IBIO.inputChar("Enter level ( H for Higher / S for Standard / P for Pre-IB ) : ");
        level = Character.toUpperCase(level);

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


    //save to a file
    public static void save() throws IOException {
        System.out.println("<<< Saving data >>>");
        File studentFile = new File("students.txt");
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

    public static void check(String id) throws IOException {
        System.out.println("<<< Loading data >>>");
        File studentFile = new File("students.txt");
        save();
        /*if (!studentFile.exists())
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
        }*/
    }

    public static void load() throws IOException
    {
        System.out.println("<<< Loading data >>>");
        File studentFile = new File("student.csv");
        if (!studentFile.exists())      // no data file? create one and have user input data
        {
            studentFile.createNewFile();
            System.out.println("Data file not found. Creating one.");
            newStudent();
        }
        FileReader fr = new FileReader(studentFile);
        BufferedReader in = new BufferedReader(fr);//read mode
        char newLevel= 0;
        int newGrade = 0;
        int newIndex = 0;
        int newNumber = 0;
        String temp;
        students.clear();
        in.readLine(); // read the header (field/attribute names for CSV)-we discard them as we don't need them here
        while (in.ready())// read lines while file has content
        {
            temp = in.readLine();
            String[] record = temp.split(",");
            newLevel = record[0].charAt(0);
            newGrade = Integer.parseInt(record[1]);
            newIndex = Integer.parseInt(record[2]);
            newNumber = Integer.parseInt(record[3]);
            Student newStudent = new Student(newLevel, newGrade, newIndex, newNumber);
            students.add(newStudent);
        }
        in.close();
        System.out.println("Data file loaded.");// optional
    }


    //Check if the student is in the 'All' students' list and returns true, otherwise false
    // used to avoid duplicates in a class
    public static boolean isInList(ClassCode studentID)
    {
        boolean found = false;
        for (Student s : students)
        {
            ClassCode currentID = s.getID();
            if (studentID == currentID)
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public static void listAllStudents()
    {
        for (Student s : students)
        {
            System.out.println(s);
        }
    }

    //search and list students of the same level by entering the level
    public static void listStudentsByLevel(char Level){
        char currentStudent;
        for (Student A: students)
        {
            currentStudent = Character.toUpperCase( A.getLevel() );
            if ( currentStudent == Character.toUpperCase(Level) )
            {
                System.out.println(A);
            }
        }
    }

    //search and list students in the same grade by entering the grade
    public static void listStudentsByGrade(int grade){
        int currentStudent;
        for (Student A: students)
        {
            currentStudent = A.getGrade();
            if ( currentStudent == Character.toUpperCase(grade) )
            {
                System.out.println(A);
            }
        }
    }

    public static void listStudentsByIndex(int index){
        int currentStudent;
        for (Student A: students)
        {
            currentStudent = A.getIndex();
            if ( currentStudent == Character.toUpperCase(index) )
            {
                System.out.println(A);
            }
        }
    }



}
