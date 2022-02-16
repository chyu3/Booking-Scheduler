import java.io.IOException;

public class mainMenu {

    public static void instructions(){
        System.out.println(
                "\n\tRules:\n" +
                        "\t! Make sure a class is created before creating a student \n" +
                        "\t! Date input must follow the format: DD/MM/YYYY \n" +
                        "\t! " +
                "\n\tInstructions:\n"
        );
    }
    public static void quit(boolean c){
            if (c == true)
            {
                return;
            }
            else
                System.out.println("");
                System.exit(0);
    }


    public static void main(String[] args) throws Exception {
        boolean continues = true;
        //new switch case for teacher, student options
        System.out.println("\n\tWelcome to the Booking Scheduler!");

        do {
            System.out.println("\n\t           ~Main Menu~");
            System.out.println("\tStudent Menu    |    Teacher Menu");
            System.out.println("\t     ⬇                    ⬇    ");
            System.out.println("\t     S          |          T");
            System.out.println("\t__________________________________");
            System.out.println("\t         *Instructions*");
            System.out.println("\t                ⬇");
            System.out.println("\t                Q");

            char user = IBIO.inputChar("\nEnter a letter for the action you want to perform: ");
            user = Character.toLowerCase(user);
            System.out.println();

            switch (user) {
                case 's':
                    StudentMenu.main(null);
                    StudentMenu.student();
                    break;

                case 't':
                    TeacherMenu.main(null);
                    TeacherMenu.teacher();
                    break;

                case 'q':
                    instructions();

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (continues);
    }
}


//return to previous step?