public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;

        int i = 100;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
                numSteps++;
            }
            else {
                i = i - 1;
                numSteps++;
            }
        }

        System.out.println(numSteps);
    }
}
