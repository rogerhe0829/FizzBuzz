package lab1;

public class Multiples {

    public static int multiples(int n, int a, int b) {
        int acc = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                acc += 1;
            }
        }
        return acc;
    }

    public static void main(String[] args) {
        System.out.println(multiples(10, 2, 3));
    }
}

