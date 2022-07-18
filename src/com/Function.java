package com;

public class Function {
    //non static method
    public int sum(int a,int b){
        return a+b;
    }
    // Static method with return type int
    public static int sub(int x,int y){
        return x-y;
    }
// non static method void  with it is private access with in the class
    private  void divition(int a, int b){
        System.out.println("Divition 2 numbers = "+(a/b));
    }
    private static  int mul(int a,int b){
        return  a*b;
    }
    public static void main(String[] args) {
        //object creation
        Function function = new Function();
        //accessing non static method
        int result=function.sum(10,20);
        System.out.println("sum of 2 number= "+result);
        System.out.println(Function.sub(20,10));
        function.divition(10, 5);
        System.out.println("Mul ="+Function.mul(2,5));

    }
}
