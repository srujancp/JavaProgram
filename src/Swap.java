public class Swap {
    public static void main(String[] args) {
        int x = 100, y = 200;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("without using 3rd variable");
        int a = 100, b = 200;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b= " + b);
        System.out.println("After swap");
        a=a+b;//300
        b=a-b;//100
        a=a-b;//200
        System.out.println("a = " + a);
        System.out.println("b= " + b);
    }
}
