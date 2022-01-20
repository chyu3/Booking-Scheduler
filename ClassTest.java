import java.util.ArrayList;

//call studentTest
//create a new class
//ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

//----------------------------------
//add student, delete student, edit student


public class ClassTest
{
    //stores/manages one class at a time
    // public static ArrayList<Class> classes = new ArrayList<>(); // move to Teacher class

    public static void addClass()
    {
<<<<<<< Updated upstream
=======
        //Calls empty constructor of Class()
        Class newClass = new Class();
>>>>>>> Stashed changes
        boolean stop = false;
        int noOfStudents = 0;

<<<<<<< Updated upstream
        char level;
        do
        {
            level = IBIO.inputChar("Level? ");
            level = Character.toUpperCase(level);
            if (level != 'S' || level != 'H')
            {
                System.out.print("Error - ");
            }
        } while (level != 'S' || level != 'H');

        int grade = IBIO.inputInt("Grade (11 or 12)? "); //grade is either 11 or 12
        while(grade < 11 || grade > 12)
        {
            grade = IBIO.inputInt("Please re-enter Grade (only 11 or 12): "); //grade is either 11 or 12
        }
        Class newClass = new Class(level, grade);
        Student newStudent = new Student(newClass.getClassCode(), level, grade);
        while (noOfStudents < 25 || stop)
        {
            // teacher inputs student data + validate input
<<<<<<< Updated upstream

            // input student data here
            //newStudent goes inside students's arraylist which is inside the Class
            
=======
            int grade = IBIO.inputInt("Grade (11 or 12)? "); //grade is either 11 or 12
            while(grade < 11 || grade > 12)
            {
                grade = IBIO.inputInt("Please re-enter Grade (only 11 or 12): "); //grade is either 11 or 12
            }
            Class newClass = new Class(level, grade);
            Student newStudent = new Student(newClass.getClassCode(), level, grade);

            //newStudent goes inside students' arraylist which is inside the Class
>>>>>>> Stashed changes
=======
        while (noOfStudents < 25 || stop)
        {
            // teacher inputs student data + validate input
            do
            {
                level = IBIO.inputChar("Level? ");
                level = Character.toUpperCase(level);
                if (level != 'S' || level != 'H')
                {
                    System.out.print("Error - ");
                } else level = level;
            } while (level != 'S' || level != 'H');

            int index = IBIO.inputInt("What is the index of this  class? (index<10): ");
            Student newStudent = new Student(level, grade, index);
            System.out.println(newStudent);
            //newStudent is inside students' arraylist which is in the Class
>>>>>>> Stashed changes
            newClass.students.add(newStudent);
            //noOfStudents++;
            char more = IBIO.inputChar("add another student (y/n)? ");
<<<<<<< Updated upstream
            if (more == 'N' || more == 'n' || noOfStudents > 25)
                stop = true;
=======
            while (noOfStudents < 25)
            {
                if (more == 'N' || more == 'n')
                    stop = true;
            }
>>>>>>> Stashed changes
        }
    }

    public static void editClass()
    {
        //call studentTest
        //create a new class
        //ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

        //Calls empty constructor of Class()
        // input class code
        // search class

        boolean stop = false;
        int noOfStudents = 0;
        while (noOfStudents < 25 || stop)
        {
            // teacher inputs student data + validate input
            char level;
            do
            {
                level = IBIO.inputChar("Level? ");
                level = Character.toUpperCase(level);
                if (level != 'S' || level != 'H')
                {
                    System.out.print("Error - ");
                }
            } while (level != 'S' || level != 'H');

            int grade = 12;

            char more = IBIO.inputChar("add another student (y/n)? ");
            if (more == 'N' || more == 'n' || noOfStudents > 25)
                stop = true;
        }
    }
/*  // move to Teacher class
    public static int search(String classCode){
        for(int i = 0; i < classes.size(); i++ )
            if(classes.get(i).getClassCode().equalsIgnoreCase(classCode) )
                return i;
        return -1;
    }
*/
    //public static void delete(){

<<<<<<< Updated upstream
    //}

=======
>>>>>>> Stashed changes
    public static void main(String[] args)
    {
        addClass();
    }
}

