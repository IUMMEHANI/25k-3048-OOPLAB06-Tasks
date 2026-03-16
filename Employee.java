package INHERITANCE;

public class Employee {
   public void work() {
        System.out.println("I am an Employee.");
    }
}
class Manager extends Employee {
   public void manageTeam() {
        System.out.println("I am managing the team.");
    }
}
class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
        m1.manageTeam();
    }
}

