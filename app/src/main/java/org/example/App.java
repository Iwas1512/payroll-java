// Author @ Anlil Iwas
// Date: 02/06/25
//Instructor: Cyrus Vandrevala

package org.example;
import java.util.Scanner;

import org.thePayroll;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payroll Calculator! We will be caluclating based on these next quiestions, have fun !\n");
        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("How many dependents do you have? ");
        int numDependents = scanner.nextInt();

       
        thePayroll payroll = new thePayroll();
        double grossPay = payroll.calculateGrossPay(hoursWorked);
        double socialSecurityTax = payroll.calculateSocialSecurityTax(grossPay);
        double federalIncomeTax = payroll.calculateFederalIncomeTax(grossPay);
        double stateIncomeTax = payroll.calculateStateIncomeTax(grossPay);
        double insuranceDeduction = payroll.calculateInsuranceDeduction(numDependents);
        double netPay = payroll.calculateNetPay(grossPay, socialSecurityTax, federalIncomeTax, stateIncomeTax, insuranceDeduction);

        
        System.out.println("\nPayroll Stub:\n");
        System.out.printf("%10s: %6.1f\n", "Hours", hoursWorked);
        System.out.printf("%10s: %6.2f $/hr\n", "Rate", 16.78);
        System.out.printf("%10s: %6.2f\n", "Gross", grossPay);
        System.out.printf("%10s: %6.2f\n", "SocSec", socialSecurityTax);
        System.out.printf("%10s: %6.2f\n", "FedTax", federalIncomeTax);
        System.out.printf("%10s: %6.2f\n", "StTax", stateIncomeTax);
        System.out.printf("%10s: %6.2f\n", "Ins", insuranceDeduction);
        System.out.printf("\n%10s: %6.2f\n", "Net", netPay);

        System.out.println("\nThank you for using my program, This concludes all calcuations, goodbye!");
        scanner.close();

  
  }
}
