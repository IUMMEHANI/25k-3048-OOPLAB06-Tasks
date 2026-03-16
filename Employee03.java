package INHERITANCE;

public class Employee03 {
    public double salary = 50000;

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
class PermanentEmployee extends Employee03 {
    public void calculateBonus() {
        double bonus = salary * 0.10;
        int Bonus = (int) bonus;
        System.out.println("Bonus: " + Bonus);
    }
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee();
        p1.displaySalary();
        p1.calculateBonus();
    }
}

