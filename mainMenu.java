
public class mainMenu {
    public static void main(String[] args) {
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
