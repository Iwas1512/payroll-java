package org;
public class thePayroll {
    public double calculateGrossPay(double hoursWorked) {
        double hourlyRate = 16.78;
        double overtimeRate = hourlyRate * 1.5;
        double standardHours = 40;

        if (hoursWorked > standardHours) {
            return standardHours * hourlyRate + (hoursWorked - standardHours) * overtimeRate;
        } else {
            return hoursWorked * hourlyRate;
        }
    }

    public double calculateSocialSecurityTax(double grossPay) {
        return grossPay * 0.06;
    }

    public double calculateFederalIncomeTax(double grossPay) {
        return grossPay * 0.14;
    }

    public double calculateStateIncomeTax(double grossPay) {
        return grossPay * 0.05;
    }

    public double calculateInsuranceDeduction(int numDependents) {
        return numDependents >= 3 ? 35.00 : 15.00;
    }

    public double calculateNetPay(double grossPay, double socialSecurityTax, double federalIncomeTax, double stateIncomeTax, double insuranceDeduction) {
        return grossPay - (socialSecurityTax + federalIncomeTax + stateIncomeTax + 10.00 + insuranceDeduction);
    }
}