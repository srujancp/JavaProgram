package com.programs;

import org.omg.CORBA.SetOverrideType;

public class selection {
    public static void main(String[] args) {
        System.out.println("Conditional statement");
        int number=12;
        if (number == 5){
            System.out.println("its equal");

        }else {
            System.out.println(" not equal");
        }

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("Divided by 3 & 5");

        }else if (number % 3 == 0){
            System.out.println("Divided by 3 ");
        }else if (number % 5 == 0){
            System.out.println("Divided by 5");
        }

        if (number % 2 == 0){
            System.out.println(number +"even number");
        }else {
            System.out.println(number +"not even number");
        }




    }
}
