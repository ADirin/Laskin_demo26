import java.util.Scanner;

public class Laskin {
    public int addMe(int a, int b) {
        return a + b;
    }
    public int subtractMe   (int a, int b) {
        return a - b;
            }
    public int multiplyMe(int a, int b) {
        return a * b;
    }
    public int divideMe(int a, int b) {
        if (b == 0) {
            return 0;
        }
            return a / b;
    }
    public static void main(String[] args) {
        Laskin ls = new Laskin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println(ls.addMe(a, b));
        System.out.println(ls.subtractMe(a, b));
        System.out.println(ls.multiplyMe(a, b));
        System.out.println(ls.divideMe(a, b));
    }
}
