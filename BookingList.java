package projectskipv2;

import java.util.*;

public class BookingList {

    private Booking[] bookStaffArray = new Booking[0];
    private Booking[] bookStudentArray = new Booking[0];
    private Staff[] staffArray = new Staff[0];
    private Student[] studentArray = new Student[0];

    public BookingList() {
        staffArray = Arrays.copyOf(staffArray, staffArray.length);
        studentArray = Arrays.copyOf(studentArray, studentArray.length);
        bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length);
        bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length);

    }

    public void addNewBooking(int i, int c, int idNo, String con, String uN, String p, double vF, double pF, double mF, double tF,
            String time, String date, String location) {

        if (con.equals("STAFF")) {
            staffArray = Arrays.copyOf(staffArray, staffArray.length + 1);
            staffArray[i] = new Staff(idNo, uN);
            bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length+1);
            bookStaffArray[i] = new Booking(p, time, date, location, vF, pF, mF, tF);

        } else if (con.equals("STUDENT")) {
            studentArray = Arrays.copyOf(studentArray, studentArray.length + 1);
            studentArray[c] = new Student(idNo, uN);
            bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length+1);
            bookStudentArray[c] = new Booking(p, time, date, location, vF, pF, mF, tF);
        }
    }

    public String searchArray(String con, int idNo) {
        //------------------------SEARCH FOR STAFF ID/MATRIC NO IN THE ARRAY------------------------
        int found = 0;
        String info = "";
        staffArray = Arrays.copyOf(staffArray, staffArray.length);
        studentArray = Arrays.copyOf(studentArray, studentArray.length);
        bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length);
        bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length);
        
        if (con.equals("STAFF")) {

            for (int i = 0; i < staffArray.length; i++) {
                if (staffArray[i].getStaffID() == idNo) {
                    found++;
                    staffArray = Arrays.copyOf(staffArray, staffArray.length);

                    info = "STAFF BOOKING ARRAY" + staffArray[i].toString() + bookStaffArray[i].toString();

                }
            }
            if (found > 0) {
                //found - successful search

            } else {
                //not found - unsuccessful search
                info = "BOOKING WITH STAFF ID " + idNo + " WAS NOT IN THE STAFF ARRAY";
            }

        } else if (con.equals("STUDENT")) {
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getMatricNo() == idNo) {
                    found++;
                    studentArray = Arrays.copyOf(studentArray, studentArray.length);

                    info = "STUDENT BOOKING ARRAY" + studentArray[i].toString() + bookStudentArray[i].toString();

                }
            }
            if (found > 0) {
                //found - successful search

            } else {
                //not found - unsuccessful search
                info = "BOOKING WITH MATRIC NO. " + idNo + " WAS NOT IN THE STAFF  ARRAY";

            }

        }
        return info;
    }

    public String crossCheckStaffStudentBooking(String con, String time, String location, String date) {
        bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length);
        bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length);

        String state = "";
        int found = 0;
        if (con.equals("STAFF")) {

            for (int i = 0; i < bookStudentArray.length; i++) {
                if (bookStudentArray[i].getTime().equals(time) && bookStudentArray[i].getLocation().equals(location) && bookStudentArray[i].getDate().equals(date)) {

                    found++;
                }
            }

            if (found > 0) {
                state = "IN THE STUDENT BOOKING ARRAY";
            } else {
                state = "NOT IN STUDENT BOOKING ARRAY";
            }

        } else if (con.equals("STUDENT")) {

            for (int i = 0; i < bookStaffArray.length; i++) {
                if (bookStaffArray[i].getTime().equals(time) && bookStaffArray[i].getLocation().equals(location) && bookStaffArray[i].getDate().equals(date)) {

                    found++;
                }
            }

            if (found > 0) {
                state = "IN THE STAFF BOOKING ARRAY";
            } else {
                state = "NOT IN STAFF BOOKING ARRAY";
            }

        }
        return state;
    }

    public String checkBookingState(String con, String time, String location, String date) {
        bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length);
        bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length);

        String state = "";
        int found = 0;
        if (con.equals("STAFF")) {
            for (int i = 0; i < bookStaffArray.length; i++) {
                if (bookStaffArray[i].getTime().equals(time) && bookStaffArray[i].getLocation().equals(location) && bookStaffArray[i].getDate().equals(date)) {
                    found++;
                }
            }

            if (found > 0) {
                state = "IN THE ARRAY";
            } else {
                state = "NEW";
            }

        } else if (con.equals("STUDENT")) {
            for (int i = 0; i < bookStudentArray.length; i++) {
                if (bookStudentArray[i].getTime().equals(time) && bookStudentArray[i].getLocation().equals(location) && bookStudentArray[i].getDate().equals(date)) {
                    found++;
                }
            }

            if (found > 0) {
                state = "IN THE ARRAY";
            } else {
                state = "NEW";
            }
        }
        return state;

    }

    public String deleteArray(String con, int idNo) {
        //------------------------SEARCH FOR CUSTOMER NAME IN THE ARRAY------------------------
        int removeIndex, found = 0;
        String info = "";

        staffArray = Arrays.copyOf(staffArray, staffArray.length);
        studentArray = Arrays.copyOf(studentArray, studentArray.length);
        bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length);
        bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length);

        if (con.equals("STAFF")) {
            for (int i = 0; i < staffArray.length; i++) {
                if (staffArray[i].getStaffID() == idNo) {
                    found++;
                    removeIndex = i;
                    for (i = removeIndex; i < staffArray.length - 1; i++) {
                        staffArray[i] = staffArray[i + 1];
                        bookStaffArray[i] = bookStaffArray[i + 1];
                    }
                    staffArray = Arrays.copyOf(staffArray, staffArray.length - 1);
                    bookStaffArray = Arrays.copyOf(bookStaffArray, bookStaffArray.length - 1);
                    info = "BOOKING UNDER STAFF ID " + idNo + " DELETED! ";

                }
            }
            if (found > 0) {
                //found and deleted

            } else {
                //not found - unsuccessful search
                info = "BOOKING UNDER STAFF ID " + idNo + " WAS NOT IN THE STAFF ARRAY";
            }

        } else if (con.equals("STUDENT")) {
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i].getMatricNo() == idNo) {
                    found++;
                    removeIndex = i;
                    for (i = removeIndex; i < studentArray.length - 1; i++) {
                        studentArray[i] = studentArray[i + 1];
                        bookStudentArray[i] = bookStudentArray[i + 1];
                    }
                    studentArray = Arrays.copyOf(studentArray, studentArray.length - 1);
                    bookStudentArray = Arrays.copyOf(bookStudentArray, bookStudentArray.length - 1);
                    info = "BOOKING UNDER MATRIC NO " + idNo + " DELETED! ";

                }
            }
            if (found > 0) {
                //found and deleted

            } else {
                //not found - unsuccessful search
                info = "BOOKING UNDER MATRIC NO " + idNo + " WAS NOT IN THE STUDENT  ARRAY";

            }
        }
        return info;
    }

    @Override
    public String toString() {
        staffArray = Arrays.copyOf(staffArray, staffArray.length);
        String dat = "";

        for (int i = 0; i < staffArray.length; i++) {
            int n = i + 1;
            dat = dat + "\n\nSTAFF BOOKING " + n + staffArray[i].toString() + bookStaffArray[i].toString();
        }

        return "STAFF BOOKING DETAILS" + dat;
    }

    public String toString1() {
        studentArray = Arrays.copyOf(studentArray, studentArray.length);
        String dat = "";

        for (int i = 0; i < studentArray.length; i++) {
            int n = i + 1;
            dat = dat + "\n\nSTUDENT BOOKING " + n + studentArray[i].toString() + bookStudentArray[i].toString();
        }

        return "STUDENT BOOKING DETAILS" + dat;
    }

}
