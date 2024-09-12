package lavisores;

import java.util.Scanner;

public class Salary {
    public Salaries gatherSalaryDetails() {
        Scanner input = new Scanner(System.in);

        Salaries salaryDetails = new Salaries();

        System.out.print("Enter your name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter age: ");
        int employeeAge = input.nextInt();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();
        System.out.print("Enter total hours worked: ");
        double totalHoursWorked = input.nextDouble();
        System.out.print("Enter total deductions: ");
        double totalDeductions = input.nextDouble();

        salaryDetails.setDetails(employeeName, employeeAge, hourlyRate, totalHoursWorked, totalDeductions);

        input.close();

        return salaryDetails;
    }
}
