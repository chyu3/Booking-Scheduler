//has and stores Day - Time - (hour, minute and second)

public class Appointment //extends StudentTest
{
    //Student student;
    public String ID;
    public Time appointmentTime;
    public Date appointmentDate;

    /*public Appointment (Student student){
        this.student = student;
    }*/

    public Appointment(String ID, Date appointmentDate, Time appointmentTime) {
        this.ID = ID;
        this.appointmentTime = appointmentTime;
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate){
        this.appointmentDate = appointmentDate;
    }
    public Date getAppointmentDate(){
        return appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}
