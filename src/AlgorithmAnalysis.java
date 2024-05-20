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
}
