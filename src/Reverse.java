public class Reverse {
    public static void main(String[] args) {

        int num = 1223456, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        int num1 = 1223456 ,reverse =0;
        while(num1 > 0){
                int digit = num1 % 10;
                reverse = reverse * 10 + digit;
                num1=num1/10;
            }

        System.out.println("Reversed Number: " + reversed);
        System.out.println("Reverse Number: " + reverse);
    }
}
