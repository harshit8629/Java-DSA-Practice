abstract class LearningCourse {
    String courseName;
    int duration;

    LearningCourse(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void startLearning();

    abstract void completeAssignment();
}

class ProgrammingCourse extends LearningCourse {

    ProgrammingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    void startLearning() {
        System.out.println("Programming Course Started");
    }

    void completeAssignment() {
        System.out.println("Coding Assignment Submitted");
    }
}

class DesignCourse extends LearningCourse {

    DesignCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    void startLearning() {
        System.out.println("Design Course Started");
    }

    void completeAssignment() {
        System.out.println("UI Design Assignment Submitted");
    }
}

class MarketingCourse extends LearningCourse {

    MarketingCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    void startLearning() {
        System.out.println("Marketing Course Started");
    }

    void completeAssignment() {
        System.out.println("Marketing Campaign Assignment Submitted");
    }
}

public class ELearningPlatformSystem {
    public static void main(String[] args) {

        LearningCourse c1 = new ProgrammingCourse("Java", 6);
        LearningCourse c2 = new DesignCourse("UI/UX", 4);
        LearningCourse c3 = new MarketingCourse("Digital Marketing", 3);

        c1.startLearning();
        c1.completeAssignment();

        System.out.println();

        c2.startLearning();
        c2.completeAssignment();

        System.out.println();

        c3.startLearning();
        c3.completeAssignment();
    }
}