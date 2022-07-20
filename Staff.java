package projectskipv2;

public class Staff extends User {

    private int staffId;

    public Staff(int staffId, String uN) {
        super(uN);
        this.staffId = staffId;
    }

    public int getStaffID() {
        return staffId;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStaff ID:" + staffId;
    }
}
