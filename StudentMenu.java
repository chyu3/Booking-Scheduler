import java.io.IOException;

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
                case 'A':
                    addTable();
                    add();
                    break;

                case 'D':
                    deleteTable();
                    delete();
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

    public static void addTable(){
        System.out.println("+\t----------==-******************-==------------+");
        System.out.println("|\t             *  " + "Add" + "  *               ");
        System.out.println("|\t_______________________________________________");
        System.out.println("|\tNew General appointment | New Oral appointment");
        System.out.println("|\t           ⬇                        ⬇         ");
        System.out.println("|\t           G                         O          ");
        System.out.println("|\t_______________________________________________");
        System.out.println("|\t             Return to previous step ");
        System.out.println("|\t                        ⬇");
        System.out.println("|\t                        B ");
    }

    public static void add() throws IOException {
        boolean continues = true;
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;
        do {
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();

            switch (decisions) {
                case 'g':
                    studentCode = IBIO.input("\nEnter a student ID: ");
                    StudentTest.check(studentCode);
                    IOManager.add(studentCode);
                    break;
                case 'o':
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
                case 'b':
                    continues = false;
                    System.out.println("returning to Student Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    StudentMenu.main(null);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);
    }

    public static void deleteTable(){
        System.out.println("+\t-------------==-******************-==--------------+");
        System.out.println("|\t                *  " + "Delete" + "  *              ");
        System.out.println("|\t____________________________________________________");
        System.out.println("|\tdelete General Appointment | delete Oral Appointment");
        System.out.println("|\t             ⬇                          ⬇ ");
        System.out.println("|\t             G                           O ");
        System.out.println("|\t____________________________________________________");
        System.out.println("|\t               Return to previous step ");
        System.out.println("|\t                          ⬇");
        System.out.println("|\t                          B ");
    }

    public static void delete() throws IOException {
        boolean continues = true;
        char level;
        int grade;
        int index;
        String classCode;  //H1101
        String studentCode; //full ID
        int classIndex;  //1 <= x <= 10
        int studentIndex;  //x > 0
        String date;
        String time;
        do {
            char decisions = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            decisions = Character.toLowerCase(decisions);
            System.out.println();

            switch (decisions) {
                case 'g':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    ClassTest.confirm();
                    StudentTest.check(studentCode);
                    AppointmentManager.delete(studentCode);
                    break;
                case 'e':
                    studentCode = IBIO.input("Please enter a student ID: ");
                    ClassTest.confirm();
                    StudentTest.check(studentCode);
                    IOManager.delete(studentCode);
                    break;
                case 'b':
                    continues = false;
                    System.out.println("returning to Student Menu...");
                    System.out.println("\t⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");
                    StudentMenu.main(null);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);

    }

    public static void main(String[] args) {
        System.out.println("+-----******************-----+");
        System.out.println("|     *  " + "Student Menu" + "  *     |");

        System.out.println("|     Add     |   Delete     |");
        System.out.println("|      ⬇           ⬇        |");
        System.out.println("|      A            D        |");
        System.out.println("|____________________________|");
        System.out.println("| Return to previous step    |");
        System.out.println("|            ⬇                ");
        System.out.println("|            B                ");

    }
}
