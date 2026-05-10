class Course {
    String courseName;
    int duration;
    String instructor;

    Course(String courseName, int duration, String instructor) {
        this.courseName = courseName;
        this.duration = duration;
        this.instructor = instructor;
    }

    void showCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Instructor: " + instructor);
    }
}

class ProgrammingCourse extends Course {
    String language;

    ProgrammingCourse(String courseName, int duration, String instructor, String language) {
        super(courseName, duration, instructor);
        this.language = language;
    }

    void startCourse() {
        System.out.println(language + " Programming Course Started");
    }
}

class MathCourse extends Course {
    int formulaCount;

    MathCourse(String courseName, int duration, String instructor, int formulaCount) {
        super(courseName, duration, instructor);
        this.formulaCount = formulaCount;
    }

    void startCourse() {
        System.out.println(courseName + " Math Course Started");
    }
}

class ScienceCourse extends Course {
    boolean laboratoryRequired;

    ScienceCourse(String courseName, int duration, String instructor, boolean laboratoryRequired) {
        super(courseName, duration, instructor);
        this.laboratoryRequired = laboratoryRequired;
    }

    void startCourse() {
        System.out.println(courseName + " Science Lab Session Started");
    }
}

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {

        ProgrammingCourse p1 = new ProgrammingCourse(
                "Programming",
                6,
                "Mr. Sharma",
                "Java"
        );

        MathCourse m1 = new MathCourse(
                "Algebra",
                4,
                "Mrs. Gupta",
                50
        );

        ScienceCourse s1 = new ScienceCourse(
                "Physics",
                5,
                "Dr. Mehta",
                true
        );

        p1.showCourseDetails();
        p1.startCourse();

        System.out.println();

        m1.showCourseDetails();
        m1.startCourse();

        System.out.println();

        s1.showCourseDetails();
        s1.startCourse();
    }
}