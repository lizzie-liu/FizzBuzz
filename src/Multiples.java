public class Multiples {
    public static void main(String[] args) {
        int numMults = 0;

        int i = 1;
        while (i < 1000){
            if (i % 3 == 0) {
                numMults++;
            }
            else if (i % 5 == 0) {
                numMults++;
            }
            i++;
        }

        System.out.println(numMults);
    }
}
