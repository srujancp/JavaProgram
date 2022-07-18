package com;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int number");
        int num= scan.nextInt();
        System.out.println("double value");
        double d=scan.nextDouble();
        System.out.println("Float value");
        float f=scan.nextFloat();
        System.out.println("long value");
        long l= scan.nextLong();
        System.out.println("Boolean value");
        boolean b=scan.nextBoolean();
        System.out.println("char value");
        char c=scan.next().charAt(0);
        System.out.println("int value= "+num);
        System.out.println("double value= "+d);
        System.out.println("float value= "+f);
        System.out.println("long value= "+l);
        System.out.println("boolean value= "+b);
        System.out.println("Char value= "+c);
        scan.nextLine();
        System.out.println("Enter String");
        String sru=scan.nextLine();
        System.out.println("String value=" +sru);
        System.out.println("Enter String");
        String s=scan.next();
        System.out.println("String value = "+s);
    }
}
