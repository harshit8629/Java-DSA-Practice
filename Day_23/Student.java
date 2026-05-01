class Student {

    private int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.setMarks(85);

        System.out.println("Marks: " + student.getMarks());
    }
}