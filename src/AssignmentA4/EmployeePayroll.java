package AssignmentA4;

public class EmployeePayroll {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private String designation;

    public EmployeePayroll(int employeeId,String employeeName,double basicSalary,String designation) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }
    public double calculateDeductions() {

        double deductionsPercentage = 0.10;
        return basicSalary * deductionsPercentage;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }

    public void displayEmployeePayrollDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Deductions: $" + calculateDeductions());
        System.out.println("Net Salary: $" + calculateNetSalary());
    }

    public static void main(String[] args) {

        EmployeePayroll employeePayroll=new EmployeePayroll(101,"Shriya",100000,"Automation Engineer");
        EmployeePayroll employeePayroll1=new EmployeePayroll(102,"Neeraj",120000,"AI Engineer");
        employeePayroll.displayEmployeePayrollDetails();
    }


    }

