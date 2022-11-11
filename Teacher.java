import java.util.*;

//further development
public class Teacher extends Student {
    public Teacher(char level, int grade, int index) {
        super(level, grade, index);
    }

    public Teacher(char level, int grade, int index, int number){
        super(level, grade, index, number);
    }

    ArrayList<Teacher> Teachers = new ArrayList<>(); //for multiple teachers

    public int getTeachers(){return Teachers.size();}



    /*public String toString() {
        return Class.toString();
    }*/
}
