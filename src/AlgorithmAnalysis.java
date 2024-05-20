import java.lang.Math;

public class AlgorithmAnalysis {

    // Fragment #1
    public static void fragment1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
        }
        System.out.println("Fragment 1: Sum = " + sum);
    }

    // Fragment #2
    public static void fragment2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 2: Sum = " + sum);
    }

    // Fragment #3
    public static void fragment3(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 3: Sum = " + sum);
    }

    // Fragment #4
    public static void fragment4(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
        }
        for (int j = 0; j < n; j++) {
            sum++;
        }
        System.out.println("Fragment 4: Sum = " + sum);
    }

    // Fragment #5
    public static void fragment5(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 5: Sum = " + sum);
    }

    // Fragment #6
    public static void fragment6(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println("Fragment 6: Sum = " + sum);
    }

    // Fragment #7
    public static void fragment7(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        sum++;
                    }
                }
            }
        }
        System.out.println("Fragment 7: Sum = " + sum);
    }

    // Fragment #8
    public static void fragment8(int n) {
        int sum = 0;
        int i = n;
        while (i > 1) {
            i = i / 2;
            sum++;
        }
        System.out.println("Fragment 8: Sum = " + sum);
    }

    // Add the isPrime method here
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test isPrime method
        System.out.println("Is 17 prime? " + isPrime(17)); // true
        System.out.println("Is 15 prime? " + isPrime(15)); // false

        // Test running times for 20-bit and 40-bit numbers
        int num20BitPrimes = 0;
        int num40BitPrimes = 0;
        long startTime, endTime;

        // Test 20-bit numbers
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * ((1 << 20) - 1)) + 1; // Generate random 20-bit number
            startTime = System.nanoTime();
            boolean prime = isPrime(num);
            endTime = System.nanoTime();
            if (prime) {
                num20BitPrimes++;
            }
            System.out.println("20-bit number: " + num + ", Prime: " + prime + ", Time: " + (endTime - startTime) + " ns");
        }

        // Test 40-bit numbers
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * ((1 << 40) - 1)) + 1; // Generate random 40-bit number
            startTime = System.nanoTime();
            boolean prime = isPrime(num);
            endTime = System.nanoTime();
            if (prime) {
                num40BitPrimes++;
            }
            System.out.println("40-bit number: " + num + ", Prime: " + prime + ", Time: " + (endTime - startTime) + " ns");
        }

        System.out.println("Number of 20-bit primes: " + num20BitPrimes);
        System.out.println("Number of 40-bit primes: " + num40BitPrimes);
    }
}
