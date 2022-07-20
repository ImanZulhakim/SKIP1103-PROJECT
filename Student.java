package projectskipv2;

public class Student extends User {

    private int matricNo;

    public Student(int matricNo, String uN) {
        super(uN);
        this.matricNo = matricNo;

    }

    public int getMatricNo() {
        return matricNo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatric No:" + matricNo;
    }
}
