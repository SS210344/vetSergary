package com.company.libarary;

import java.util.Scanner;

public class libaryFunctions {

    public static int getInt() {
        int number;

        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("give a number");
                number = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(e);
                input.next();
            }
        }


        return number;
    }
    public static String getString() {
        String word;

        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("give a number");
                 word = input.next();
                break;
            } catch (Exception e) {
                System.out.println(e);
                input.next();
            }
        }

        return word;
    }
    public static double getDouble() {
        double number;

        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("give a number");
                number = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println(e);
                input.next();
            }
        }


        return number;
    }

}
