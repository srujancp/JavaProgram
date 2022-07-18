public class Char {
    public static void main(String[] args) {
        int [] num = new int[5];
        int j=10;
        for(int i=0;i<5;i++) {
        num[i]=j;
        j++;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }

        }

}
