public class Ternary {
    public static void main(String[] args) {
        int a=4 ,b=2;
        int c=a>b?a:b;
        System.out.println(c);
        System.out.println("........");
        String s="Srujan Hollo";// String Length
        char[] ch = s.toCharArray();
        for(int i=0;i<ch .length;i++) {
            System.out.print(ch[i] + "     ");
        }
        System.out.println("........");
        System.out.println("char Array length= "+ch.length);
            System.out.println(s.length());
        String words[]=s.split(" ");
        for(int i=0;i< words.length;i++) {
            System.out.print(words[i] + "     ");
        }
        System.out.println("words array length="+words.length);
    }
}
