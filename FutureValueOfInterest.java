package FinancialCalculator;

import java.util.Scanner;

public class FutureValueOfInterest {
    public static void main(String[] args){

        Scanner myscanner = new Scanner(System.in);

//// User input Q&A

        System.out.println("What is the deposit amount? ");
        int deposit = myscanner.nextInt();

        System.out.println("What is the interest rate? ");
        float interestRate = myscanner.nextFloat();

        System.out.println("What is the time span? ");
        int timeSpan = myscanner.nextInt();


//// Formula to calculate: Amount= Deposit(1+Rate/100)^time

        double amount = deposit * (Math.pow ((1 + interestRate / 100), timeSpan));

//// Compound interest formula: Compound Interest= Amount - deposit

        double compound = amount - deposit;

//// System print

        System.out.println("Total amount in " + timeSpan + " years" + " will be: " + amount);
        System.out.println("Total compounded interest will be: " + compound );

    }
}
