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
        System.out.println(ls.addMe(12, 2));
        System.out.println(ls.subtractMe(12, 2));
        System.out.println(ls.multiplyMe(12, 2));
        System.out.println(ls.divideMe(12, 2));
    }
}
