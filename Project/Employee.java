package Project;
//443058333
//Abdul Hasib Zahid

public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;
    private String departmentId;

    public Employee(String employeeId, String employeeName, double salary, String departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public void employeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department ID: " + departmentId);
    }

    public void checkIn() {
        System.out.println(employeeName + " has checked in.");
    }

    public void receiveSalary() {
        System.out.println(employeeName + " has received a salary of " + salary);
    }
}
