public class ClassCode {
    //ClassCode parameters
    private char Level;
    private int Grade;
    public int Index; //class number
    private int Number; //student's number or counter

    public ClassCode() {

    }


    public int getNumber() {
        return Number;
    }

    public int getGrade() {
        return Grade;
    }

    public int getIndex() {
        return Index;
    }

    public char getLevel() {
        return Level;
    }

    //Set ID, Level, Grade
    public ClassCode(char level, int grade, int index, int number) {
        this.Level = level;
        this.Grade = grade;
        this.Index = index;
        this.Number = number;
    }

    @Override
    public String toString() {
        return "ID{" +
                "Level=" + Level +
                ", Grade=" + Grade +
                ", Index=" + Index +
                '}';
    }




}

