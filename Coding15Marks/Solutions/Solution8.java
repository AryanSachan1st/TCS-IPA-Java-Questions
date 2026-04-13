package Coding15Marks.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    private int accId;
    private String holderName, accType;
    private double balance;

    // constructor
    public BankAccount(int accId, String holderName, String accType, double balance) {
        this.accId = accId;
        this.holderName = holderName;
        this.accType = accType;
        this.balance = balance;
    }

    // setters
    public void setAccId(int accId) {
        this.accId = accId;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getters
    public int getAccId() {
        return this.accId;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public String getAccType() {
        return this.accType;
    }

    public double getBalance() {
        return this.balance;
    }

    // methods
    public void applyInterest(double rate) {
        double si = 0.0;

        if (this.accType.equalsIgnoreCase("savings")) {
            si = (this.balance * rate * 1)/100.0;
        } else if (this.accType.equalsIgnoreCase("current")) {
            si = (this.balance * rate * 0.5 * 1)/100.0;
        }

        this.balance += si;
    }
}

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int numAcc = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<numAcc; i++) {
            System.out.print("Enter AccId: ");
            int accId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter AccHolderName: ");
            String holderName = sc.nextLine();

            System.out.print("Enter AccType: ");
            String accType = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(accId, holderName, accType, balance);
            accounts.add(account);
        }

        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();

        for (BankAccount acc: accounts) {
            acc.applyInterest(interestRate);
            System.out.println("AccId: " + acc.getAccId() + ", AccHolderName: " + acc.getHolderName() + ", Balance (with interest): " + acc.getBalance());
        }

        sc.close();
    }
}