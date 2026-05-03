class Attendance {

    private int presentDays = 0;

    void markPresent() {
        presentDays++;
    }

    int getAttendance() {
        return presentDays;
    }

    public static void main(String[] args) {

        Attendance attendance = new Attendance();

        attendance.markPresent();
        attendance.markPresent();
        attendance.markPresent();

        System.out.println("Present Days: " + attendance.getAttendance());
    }
}