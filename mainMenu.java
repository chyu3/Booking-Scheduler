import java.io.IOException;

public class mainMenu {
    public static void main(String[] args) throws IOException {
        /*do while loop
        options/decision parameter (methods to use)
            switch (decision){
                case '':
                    StudentTest.main(null);
                    break;

                case '':


         */
        boolean continues = true;
        do{
            char level;
            int grade ;
            int index;

            //'if else' loop to distinguish teacher and student access to actions
            char user = IBIO.inputChar("Are you teacher or student (t/s): ");
            user = Character.toUpperCase(user);

            if (user == 't') {
                char decisions = IBIO.inputChar("Enter the action you want to perform\n");
                decisions = Character.toUpperCase(decisions);
                TeacherMenu.main(null);

                switch (decisions) {
                    case 'c':
                        ClassTest.addClass();
                        break;
                    case 'e':
                        ClassTest.editClass();
                        break;
                    case 'k':
                        ClassTest.listClasses(null);
                        break;
                    case 'S':
                        StudentTest.newStudent();
                        break;
                    case 'U':
                        level = IBIO.inputChar("HL or SL or Pre-IB (Enter h, s or p): ");
                        grade = IBIO.inputInt("Grade? (11 or 12): ");
                        index = IBIO.inputInt("class number? < 10: ");
                        StudentTest.editStudent(level, grade, index);
                        break;
                    case 'D':
                        level = IBIO.inputChar("HL or SL or Pre-IB (Enter h, s or p): ");
                        grade = IBIO.inputInt("Grade? (11 or 12): ");
                        index = IBIO.inputInt("class number? < 10: ");
                        //number = IBIO.inputInt("Student number?")
                        //!number less likely to be memorized by teacher
                        StudentTest.delete(level, grade, index);
                        break;
                }
            }
            else {
                char decisions = IBIO.inputChar("Enter the action you want to perform\n");
                decisions = Character.toUpperCase(decisions);
                StudentMenu.main(null);

                switch (decisions){
                    case 'A':
                        AppointmentManager.add(null);
                }
            }

        } while (continues);
    }
}
