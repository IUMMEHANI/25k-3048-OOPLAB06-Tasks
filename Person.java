package INHERITANCE;

public class Person {
    public void displayPerson() {
        System.out.println("I am a person.");
    }
}
class Student extends Person {
    public void displayStudent() {
        System.out.println("I am a student.");
    }
}
class GraduateStudent extends Student {
    public void research() {
        System.out.println("I am a Graduate and I am doing research.");
    }
}
class MAIN {
    public static void main(String[] args) {
        GraduateStudent g1 = new GraduateStudent();
        g1.displayPerson();
        g1.displayStudent();
        g1.research();
    }
}
