public class Reduce {
    public static void main(String[] args) {

        for (int i = 100; i > 0;) {

            boolean even = i % 2 == 0;
            boolean odd = i % 2 != 0;;

            if (even) {

                System.out.println(i / 2);
                i = i / 2;

            } else if (odd) {

                System.out.println(i - 1);
                i = i - 1;

            }
        }
    }
}
