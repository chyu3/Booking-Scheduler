import java.util.ArrayList;

public class ClassTest {
    public static void main(String[] args){
        //call studentTest
        //create a new class
        //ArrayList<Class> temp = new ArrayList<>(); // <- TeacherTest?

        //Calls empty constructor of Class()
        Class newClass = new Class();
        boolean stop = false;
        int noOfStudents = 0;
        // while noOfStudents <25 || stop
        {
            // inout student data by teacher
            Student newStudent = new Student(Level, Grade, Number, newClass.getClassCode() );
            newClass.add(newStudent);
            noOfStudents++;
            char more = IBIO.inputChar("add another student (y/n)? ");
            if(more == 'N' || more == 'n' || noOfStudents > 25)
                stop = true;
        }

    }
}
