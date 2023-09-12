/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            count = dofizzbuzz(count);

        }
    }

    private static int dofizzbuzz(int count) {
        boolean divisibleBy3 = count % 3 == 0;
        boolean divisibleBy5 = count % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");
            count++;

        } else if (divisibleBy3) {

            System.out.println("Fizz");
            count++;

        } else if (divisibleBy5) {

            System.out.println("Buzz");
            count++;

        } else {

            System.out.println(count);
            count++;

        }
        return count;
    }
}
