package FinancialCalculator;

import java.util.Scanner;

public class MortgageCalculator {
    private static final int MONTHS_IN_A_YEAR =12;
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
/////Initial user questions////////////
        System.out.println("Enter the principle amount: ");
        double principle = myscanner.nextDouble();

        System.out.println("Enter the annual interest rate in decimals: ");
        float annualInterestRate = myscanner.nextFloat();

        System.out.println("Enter term in years: ");
        int termInYears = myscanner.nextInt();

///// Calculating the monthly interest rate and the number of payments/////
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;


/////Monthly Payment Calculation: P [ i(1 + i)^n ] / [ (1 + i)^n – 1]

        double monthlyPayments = principle * (
                (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
                ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) -1)
                );
        System.out.println("Monthly payment: " + monthlyPayments );

////Calculating total amount paid= # of payments * monthly payments
////Then Subtract principle from the total amount.
        double totalAmountPaid =( numberOfPayments * monthlyPayments);
        double totalInterestPaid = (totalAmountPaid - principle);

        System.out.println("Total interest paid: " + totalInterestPaid );


    }
}



