class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
    }
}

public class task2 {
    public static void main(String[] args) {
        Student s = new Student("Harshit", 101);
        s.display();
    }
}