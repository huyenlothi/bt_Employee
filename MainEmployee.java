public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new EmployeeFullTime("1001a","Hao",25,"0982333445","Hao@gmail.com",500000,150000,3000000);
        employees[1] = new EmployeeFullTime("1002a","Duong",30,"09874448859","Duong@nnjjj",100000,50000,2500000);
        employees[1].setName("DUONG");
        employees[2] = new EmployeePartTime("2001p","huong",35,"0987887887","huong@gmai.com",68);
        employees[3] = new EmployeePartTime("2002p","nga",35,"09878868865","nga@gmai.com",54);

        ManagerEmployee managerEmployee = new ManagerEmployee();
        managerEmployee.getUnderAvgFulltimeList(employees);

        System.out.println("Lương phải trả cho nhân viên bán thời gian: ");
        System.out.println(ManagerEmployee.calMustPaySalary(employees));

        System.out.println("Sắp xếp nhân viên fulltime theo lương: ");
        System.out.println(ManagerEmployee.sortEmployeeFulltime(employees));

    }
}
