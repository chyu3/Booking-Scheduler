public class StudentMenu {

    public static void student() throws Exception {
        boolean continues = true;
        char level;
        int grade;
        int index;
        String classCode;  //H112
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;
        do{
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toUpperCase(decisions);
            System.out.println();
            switch (decisions) {
                case 'C':
                    studentCode = IBIO.input("\nEnter a student ID: ");
                    StudentTest.check(studentCode);
                    IOManager.add(studentCode);
                    break;

                case 'S':
                    studentCode = IBIO.input("\nEnter a student ID: ");

                    StudentTest.check(studentCode);
                    date = IBIO.input("\nEnter the date (DD/MM/YYYY): ");
                    time = IBIO.input("\nPlease input the Starting time: ");
                    AppointmentManager.add(studentCode, new Date(date), new Time(time));
                    ClassTest.confirm();
                    if (ClassTest.confirm() == true) {
                        AppointmentManager.listAppointments();
                    } else return;
                    break;

                case 'B':
                    continues = false;
                    System.out.println("returning to Main Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    mainMenu.main(null);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (continues);
    }

    public static void main(String[] args) {
        System.out.println("+---------------******************----------------+");
        System.out.println("|               *  " + "Student Menu" + "  *                |");

        System.out.println("|  New Oral appointment | New General appointment |");
        System.out.println("|            ⬇                    ⬇              |");
        System.out.println("|            C                     S              |");
        System.out.println("|_________________________________________________|");
        System.out.println("|               Return to previous step ");
        System.out.println("|                          ⬇");
        System.out.println("|                          B ");

    }
}
