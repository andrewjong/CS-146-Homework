package hw02;

/**
 * Created by andrew on 2/18/17.
 */
public class AlgoTest {
    public static int foo(double n) {
        int count = 0;
        for (int i = 0; i < 567; i++)
            for (int j = 0; j < n; j++)
                for(int k = 0; k < j; k++)
                    count++;
        return count;
    }

    static void testFoo() {
        for (int i = 0; i < 10; ++i) {
            double input = Math.pow(10, i);

            double formula1 = 567 / 2 * input * (input + 1);
            double formula2 = 567 / 2 * input * (input - 1);


            System.out.println("n + 1: " + formula1);
            System.out.println("n - 1: " + formula2);
            System.out.println(foo(input));
            System.out.println();
        }
    }

    static void makeSomeNoise(int n) {
        while (n > 1) {
            meow();
            n /= 13;
        }
    }

    static void makeSomeNoiseN(int n) {
        int N = n;
        for (int i = 1; i < N; ++i) {
            meow();
            while (n > 1) {
				meow();
				n /= 13;
			}
        }
    }

    static void makeSomeNoiseR(int n) {
        if (n > 1) {
            meow();
            makeSomeNoiseR(n / 13);
        }
        return;
    }

    static void meow() {
        System.out.println("meow");
    }

    // Problem 5a
    static int computer2Exponent(int power) {
        int result = 1;
        for (int i = 0; i < power; ++i) {
            result *= 2;
        }
        return result;
    }

    static int foo(int n) {
        if (n <= 1)
            return 2;
        if (n % 2 == 0) {
            int a = foo(n / 2);
            return a * a;
        }
        return 2 * foo(n - 1);
    }

    public static void main(String[] args) {
//        System.out.println(computer2Exponent(-1));
        makeSomeNoiseN(14);
//        System.out.println(foo(16));
    }
}
