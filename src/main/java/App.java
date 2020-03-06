import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
//        System.out.println(sum(a, b));
//        System.out.println(div(a, b));
        System.out.println(easyline(4));
        fact(4);


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a - b;
    }

    /*
     * n!
     * ----------
     * m!*(n-m)!
     *
     */
    public static BigInteger easyline(int n) {
        BigInteger rez = new BigInteger("0");
        for (int i = 0; i <= n; i++) {
            rez = rez.add(fact(n).divide(fact(i).multiply(fact(n-i))).pow(2));
        }
        return rez;
    }

    public static BigInteger fact(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            BigInteger rez = new BigInteger("1");
            for (int i = 1; i <= n; i++) {
                rez = rez.multiply(BigInteger.valueOf(i));
            }
            return rez;
        }
    }
}
