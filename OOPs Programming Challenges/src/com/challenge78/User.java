package com.challenge78;

public class User {
    public static void main (String [] args ){
        bankAccount vimlaAcc = new bankAccount("Vimla",568794238);
        bankAccount rameshAcc = new  bankAccount("Ramesh",852146655);
        rameshAcc.deposit(5000);
        System.out.println(rameshAcc.getBalance());
        rameshAcc.withdraw(600);
        System.out.println(rameshAcc.getBalance());
        System.out.println(vimlaAcc.getBalance());
        vimlaAcc.deposit(200);
        System.out.println(vimlaAcc.getBalance());

    }
}
