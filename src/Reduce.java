public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;  // If n is even, divide it by 2
            } else {
                n -= 1;  // If n is odd, subtract 1
            }
            steps++;
        }

        System.out.println(steps);
    }
}