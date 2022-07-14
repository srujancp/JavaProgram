public class Year {
    public static void main(String[] args) {
        int year = 1999;
        if(((year % 4 == 0) && (year % 100!= 0)) || year%400 ==0){
            System.out.println( "it is Leap year");
        }else
            System.out.println("it is not Leap year");
    }
}
