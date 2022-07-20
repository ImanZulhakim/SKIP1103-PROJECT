package projectskipv2;

public class Booking {

    private String purpose, time, date, location;
    private double venueFees, projectorFees, microphoneFees, totalFees;

    public Booking(String p, String time, String date, String location, double vF, double pF, double mF, double tF) {
        this.purpose = p;
        this.time = time;
        this.date = date;
        this.location = location;
        this.venueFees = vF;
        this.projectorFees = pF;
        this.microphoneFees = mF;
        this.totalFees = tF;
    }

    public String getTime(){
        return time;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getLocation(){
        return location;
    }
    
    public double getVenueFees() {
        return venueFees;
    }

    public double getProjectorFees() {
        return projectorFees;
    }

    public double getMicrophoneFees() {
        return microphoneFees;
    }

    public double calculateTotalFees(String con) {
        if (con.equals("STAFF")) {         
            totalFees = 0.95 * (getVenueFees() + getProjectorFees() + getMicrophoneFees());
            //total fees for staff is Venue Fees + Projector Fees + Microphone Fees with 5% discount
            // Venue Fees is FIXED
            //Projector and Microphone Fees depends on booking selection
            
        } else if (con.equals("STUDENT")) {
            totalFees = 0.8 * (getVenueFees() + getProjectorFees() + getMicrophoneFees());
            //total fees for staff is Venue Fees + Projector Fees + Microphone Fees with 10% discount
            // Venue Fees is FIXED
            //Projector and Microphone Fees depends on booking selection
        }
        return totalFees;    
}

    @Override
    public String toString() {
        return "\nTime:" + time + "\nDate:" + date + "\nLocation:" + location
                + "\nBooking Purpose: " + purpose
                + "\nVenue Fees:" + String.format("RM %.2f", venueFees) + "\nProjector Fees:" + String.format("RM %.2f", projectorFees)
                + "\nMicrophone Fees:" + String.format("RM %.2f", microphoneFees) + "\nTotal Fees:" + String.format("RM %.2f", totalFees);
                //+ " (5% Discount for Staff)";
               // + " (10% Discount for Student)";
    
    }
    
    
    
}
