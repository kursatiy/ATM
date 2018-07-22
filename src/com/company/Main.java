package com.company;

import java.util.Scanner;

public class Main {
    public static int[] nominalValues = {200, 100, 50, 20, 10, 5};
    public static float[] quantityOfNominals = {0, 0, 0, 10, 10, 10};
    private static int k = 0;
    private static int j = 0;


    public static void main(String[] args) {
        WorkWithMoney atm = new WorkWithMoney();


        while (j < 3) {
            System.out.println("Please enter your credit card number");
            Scanner reader = new Scanner(System.in);
            int credCartNumber = reader.nextInt();
            System.out.println("Please enter your password");
            int credCardPassword = reader.nextInt();


            if ((credCartNumber == 123456) && (credCardPassword == 123456)) {

                while (k == 0) {
                    System.out.println("What do you want to do?");
                    System.out.println("Put money into the account - press 1\nWithdraw money from account press 2");
                    int customerDecision = reader.nextInt();

                    if (customerDecision == 1) {
                        System.out.println("How much money do you want to add?");
                        int moneyToAdd = reader.nextInt();
                        atm.addMoney(moneyToAdd, 0);
                    }
                    if (customerDecision == 2) {
                        System.out.println("How much money do you want to withdraw?");
                        int moneyToWithdraw = reader.nextInt();
                        atm.withdrawMoney(moneyToWithdraw, 0);
                    }
                }
            } else {
                System.out.println("Your cart number/password is incorrect");


            }
            j++;
        }
    }
}




