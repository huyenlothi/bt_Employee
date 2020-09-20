public class EmployeeFullTime extends Employee {
    private double bonus;
    private double fine;
    private double salary;

    public EmployeeFullTime(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public EmployeeFullTime(String code, String name, int age, String phone, String email, double bonus, double fine, double salary) {
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calSalary() {
        return this.salary + this.bonus - this.fine;
    }

    @Override
    public String toString() {
        return super.toString() + "EmployeeFullTime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", salary=" + salary +
                '}';
    }
}
