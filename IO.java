//Duration is fixed

public class IO extends Appointment{
    Student student;
    public int Duration;

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public IO(Student student) {
        super(student);
    }
}
