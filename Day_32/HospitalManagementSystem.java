class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Doctor extends Person {
    String specialization;

    Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }

    void performDuty() {
        System.out.println("Doctor " + name + " is treating patients");
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    String wardAssigned;

    Nurse(String name, int age, String gender, String wardAssigned) {
        super(name, age, gender);
        this.wardAssigned = wardAssigned;
    }

    void performDuty() {
        System.out.println("Nurse " + name + " is taking care of " + wardAssigned + " patients");
    }
}

class Patient extends Person {
    String disease;

    Patient(String name, int age, String gender, String disease) {
        super(name, age, gender);
        this.disease = disease;
    }

    void performDuty() {
        System.out.println("Patient " + name + " is suffering from " + disease);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Rahul", 40, "Male", "Cardiologist");
        Nurse n1 = new Nurse("Priya", 28, "Female", "ICU");
        Patient p1 = new Patient("Aman", 22, "Male", "Fever");

        d1.displayInfo();
        d1.performDuty();

        System.out.println();

        n1.displayInfo();
        n1.performDuty();

        System.out.println();

        p1.displayInfo();
        p1.performDuty();
    }
}