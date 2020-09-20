import javax.xml.crypto.dom.DOMCryptoContext;

public class EmployeePartTime extends Employee{
    private int workingHours;
    private final double salaryPerhour = 100000;


    public EmployeePartTime(String code, String name, int age, String phone, String email, int workingHours) {
        super(code, name, age, phone, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    @Override
    public double calSalary(){
        return this.workingHours*this.salaryPerhour;
    }

    @Override
    public String toString() {
        return super.toString()+ "EmployeePartTime{" +
                "workingHours=" + workingHours +
                ", salaryPerhour=" + salaryPerhour +
                '}';
    }
}
