import java.util.Scanner;

public class ManagerEmployee {

   public  void addEmployee() {

       Scanner input = new Scanner(System.in);

       System.out.println("Enter employee full time number");
       int employeeFullTimeNumber = input.nextInt();
       System.out.println("enter employ part time number: ");
       int employeePartTimeNumber = input.nextInt();
       input.nextLine();
       Employee[] employees = new Employee[employeeFullTimeNumber + employeePartTimeNumber];

       for (int i = 0; i < employeeFullTimeNumber; i++) {
           System.out.println("Enter employee full time " + (i + 1));
           System.out.println("enter employee code: ");
           String code = input.nextLine();
           System.out.println("enter employee name: ");
           String name = input.nextLine();
           System.out.println("enter employee age: ");
           int age = input.nextInt();
           input.nextLine();
           System.out.println("enter employee phone: ");
           String phone = input.nextLine();
           System.out.println("enter employee email: ");
           String email = input.nextLine();
           System.out.println("enter employee bonus: ");
           double bonus = Double.parseDouble(input.nextLine());
           System.out.println("enter employee fine: ");
           double fine = Double.parseDouble(input.nextLine());
           System.out.println("enter employee salary: ");
           double salary = Double.parseDouble(input.nextLine());

           employees[i] = new EmployeeFullTime(code, name, age, phone, email,bonus,fine,salary);
       }

       for (int i = 0; i < employeePartTimeNumber; i++) {
           System.out.println("Enter employee part time " + (i + 1));
           System.out.println("enter employee code: ");
           String code = input.nextLine();
           System.out.println("enter employee name: ");
           String name = input.nextLine();
           System.out.println("enter employee age: ");
           int age = input.nextInt();
           input.nextLine();
           System.out.println("enter employee phone: ");
           String phone = input.nextLine();
           System.out.println("enter employee email: ");
           String email = input.nextLine();
           System.out.println("enter employee workingHours: ");
           int workingHours = Integer.parseInt(input.nextLine());

           employees[i] = new EmployeePartTime(code, name, age, phone, email, (int) workingHours);
       }
   }

   public double getAvgSalary(Employee[] employees){
       double totalSalary =0;
       for (int i = 0; i < employees.length; i++) {
           totalSalary += employees[i].calSalary();
       }
       return totalSalary/ employees.length;
   }
    public void getUnderAvgFulltimeList(Employee[] employees) {
        double average = getAvgSalary(employees);
        System.out.println("Danh sách nhân viên fulltime có lương thấp hơn trung bình: ");
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime) {
                if (employee.calSalary() < average) {
                    System.out.println(employee.getName());
                }
            }
        }
    }

    public static  double calMustPaySalary(Employee[] employees) {
        double mustPaySalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                mustPaySalary += employee.calSalary();
            }
        }
        return mustPaySalary;
    }

    public static String sortEmployeeFulltime(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calSalary() > employees[j].calSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        String string = "";
        for (Employee employee: employees) {
            if (employee instanceof EmployeeFullTime) {
                string += employee.getName() + " ";
            }
        }
        return string;
    }

}
