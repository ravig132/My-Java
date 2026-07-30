package com.challenge78;

import java.util.Scanner;

public class bankAccount {
    private String PAN ;
    private int accNumber ;
    private String accHolderName ;
    private double balance ;

    public bankAccount(String accHolderName, int accNumber){
        this.accHolderName = accHolderName ;
        this.accNumber = accNumber ;
    }

    public double getBalance(){
        System.out.print("Amount in "+this.accHolderName+" Account is : ");
        return balance;
    }

    public void deposit(int Amount){
        Scanner input = new Scanner(System.in);
        if (Amount > 50000){
            System.out.print("Enter the PAN No. : ");
            this.PAN = input.next();
        }
        if (Amount <= 0){
            System.out.println("Invalid Deposit !");
        }else{
            balance += Amount ;
        }
    }

    public void withdraw (int Amount){
        if (Amount > balance){
            System.out.println("Insufficient Balance !");
        } else if (Amount <= 0) {
            System.out.println("Invalid Withdrawl");
        } else{
            balance -= Amount ;
        }
    }

}
