package org.example.encapsulation;

public class BankAccount {
    // write the code of bank account class here
    private String accountNumber;
    private int balance;
    private double roi;

    double getSimpleInterest(int timeInYears) {
        return balance*timeInYears*roi*0.01;
    }

    double getBalanceWithInterest(int timeInYears) {
        return balance+getSimpleInterest(timeInYears);
    }
}

