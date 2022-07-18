package com;
import java.util.Scanner;
public class Arraryclass {
    public static void main(String[] args) {
        System.out.println("Enter  Array Size");
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        double d[]= new double[size];
        double result[]= Arraryclass.initializeArray(d,size,sc);
        Arraryclass.display(result);
    }
private static double[] initializeArray(double[]arr,int size, Scanner obj) {
         for(int i=0;i<size;i++){
             System.out.println("enter" + i + " index value");
             arr[i]=obj.nextDouble();
    }
        return arr;
    }
    private static void display(double[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

