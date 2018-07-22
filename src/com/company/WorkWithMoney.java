package com.company;

public class WorkWithMoney {
    private static int i = 0;
    private static int a;
    private static float temp;
    private float rmoney;

    public void addMoney(int money, int iterator) {

        if (money != 0) {
            int count = money / Main.nominalValues[i];
            if (count != 0) {
                Main.quantityOfNominals[i] = Main.quantityOfNominals[i] + count;
                a = money - (Main.nominalValues[i] * count);
                if (i < 5) {
                    addMoney(a, i++);
                }
            } else {
                Main.quantityOfNominals[i] = Main.quantityOfNominals[i] + count;
                if (i < 5) {
                    addMoney(a, i++);
                }

            }
        }
        i = 0;

    }


    public void withdrawMoney(float money, int iterator) {
        if (money != 0 && i == 0) {
            rmoney = money;
        }
        if (money != 0 && Main.quantityOfNominals[i] != 5) {
            float count = money / Main.nominalValues[i];
            int countTemp = (int) count;


            float m = money - (Main.nominalValues[i] * countTemp);
            while (count < 1) {
                withdrawMoney(money, i++);
            }

            if (Main.quantityOfNominals[i] != 0) {
                Main.quantityOfNominals[i] = Main.quantityOfNominals[i] - (int) count;
                if (Main.quantityOfNominals[i] < 0) {
                    temp = (((Main.quantityOfNominals[i] * Main.nominalValues[i])) - m) * -1;
                    Main.quantityOfNominals[i] = 0;
                    if (i != 5) {
                        withdrawMoney(temp, i++);
                    }
                }
            }
            if (Main.quantityOfNominals[i] == 0 && i != 5) {
                withdrawMoney(money, i++);
            }
            if (Main.quantityOfNominals[i] == 0 && i == 5) {
                float res = rmoney - temp;
                System.out.println("It's not enough money in the ATM, take " + (res));
                temp = 0;
            }
        }

    }

}







