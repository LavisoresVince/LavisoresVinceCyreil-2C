package lavisores;

public class Salaries {
    String employeeName;
    int employeeAge;
    double hourlyRate;
    double totalHoursWorked;
    double totalDeductions;

    public void setDetails(String name, int age, double rate, double hours, double deductions) {
        this.employeeName = name;
        this.employeeAge = age;
        this.hourlyRate = rate;
        this.totalHoursWorked = hours;
        this.totalDeductions = deductions;
    }

    public void displaySalarySlip() {
        double grossPay = hourlyRate * totalHoursWorked;
        double netPay = grossPay - totalDeductions;

        System.out.println("Salary Slip:");
        System.out.println("Date: Aug 14, 2024");
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Total Gross Pay: " + grossPay);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("----------------------------------");
        System.out.println("Net Pay: " + netPay);
    }
}
