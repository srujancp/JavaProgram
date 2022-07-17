public class Largest {
    public static void main(String[] args) {

        int a =60 , b = 10, c = 50;

        if((a>b)&&(a>c)) {
                System.out.println(a + " is the largest number.");
        } else if((b>c)&&(b>a)){
                System.out.println(b + " is the largest number.");
        }
        else
            System.out.println(c + " is the largest number.");
        System.out.println(".......................");
        if((a<b) && (a<c)){
            System.out.println(a + "is the smallest number");
        }else if((b<c)&&(b<a)){
            System.out.println(b + " is the smallest number.");
        }
        else
            System.out.println(c + " is the smallest number.");
        }


    }

