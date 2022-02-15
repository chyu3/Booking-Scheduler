import java.util.*;

public class AppointmentManager extends Appointment {
    boolean Continue = true;

    public static ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    public AppointmentManager(Student student) {
        super(student);
    }

    //add a general appointment
    public static void add(String ID){
        String date = IBIO.input("Please enter the date (Day/Month/Year):  ");
        Date object = new Date(date);
        appointments.add(object.Date(date) + " " + ID);
        ClassTest.confirm();
        if (ClassTest.confirm() == true){
            printAppointments();
        }
    }

    //get appointment index from the arraylist
    public static void delete (String ID){
        ID = Student.getID();
        for (int i = 0; i < appointments.size(); i++)
        {
            Appointment currentAppointment = appointments.get(i);
            String currentAppointmentNumber = currentAppointment.ID;
            if(currentAppointmentNumber.equals(ID))
            {
                System.out.println("Searching success! Continue to delete " + currentAppointmentNumber);
                if(ClassTest.confirm() == true)
                {

                }
            }
        }
    }

    public Appointment printAllAppointments(){
        boolean a = true;
        do{
            for (int i = 0; i < appointments.size(); i++){
                return appointments.get(i);
            }
        } while (a = true);
        return null;
    }

    public static void main(String[] args) {
        //2D array (prints scheduler) : after ID and time assigned

    }

}
