package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.thePayroll;

class AppTest {
  thePayroll payroll = new thePayroll();

    

    @Test
    void testCalculateGrossPayWithoutOvertime() {
        assertEquals(335.60, payroll.calculateGrossPay(20), 0.01);
    }

    @Test
    void testCalculateGrossPayWithOvertime() {
        assertEquals(797.05, payroll.calculateGrossPay(45), 0.01); 
    }

    @Test
    void testCalculateSocialSecurityTax() {
        assertEquals(20.14, payroll.calculateSocialSecurityTax(335.60), 0.01);
    }

    @Test
    void testCalculateFederalIncomeTax() {
        assertEquals(46.98, payroll.calculateFederalIncomeTax(335.60), 0.01);
    }

    @Test
    void testCalculateStateIncomeTax() {
        assertEquals(16.78, payroll.calculateStateIncomeTax(335.60), 0.01);
    }

    @Test
    void testCalculateInsuranceDeductionForThreeOrMoreDependents() {
        assertEquals(35.00, payroll.calculateInsuranceDeduction(3), 0.01);
    }

    @Test
    void testCalculateInsuranceDeductionForLessThanThreeDependents() {
        assertEquals(15.00, payroll.calculateInsuranceDeduction(2), 0.01);
    }

    @Test
    void testCalculateNetPay() {
        double grossPay = 335.60;
        double socialSecurityTax = payroll.calculateSocialSecurityTax(grossPay);
        double federalIncomeTax = payroll.calculateFederalIncomeTax(grossPay);
        double stateIncomeTax = payroll.calculateStateIncomeTax(grossPay);
        double insuranceDeduction = payroll.calculateInsuranceDeduction(3);
        double netPay = payroll.calculateNetPay(grossPay, socialSecurityTax, federalIncomeTax, stateIncomeTax, insuranceDeduction);

        assertEquals(206.70, netPay, 0.01); 
    }
}
