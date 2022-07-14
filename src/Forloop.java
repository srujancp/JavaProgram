public class Forloop {
    public static void main(String[] args) {
        for (int num = 2; num <= 20; num++) {
            for (int i = 1; i <= 10; ++i) {
                System.out.println(num + "*" + i + "=" + num * i);
            }
        }
    }
}
