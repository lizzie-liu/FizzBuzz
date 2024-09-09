public class Multiples {
    public static void main(String[] args) {
        int numMults = 0;
        while (i < 1000){
            if (i % 3 == 0) {
                numMults++;
            }
            elif (i % 5 == 0) {
                numMults++;
            }
            i++;
        }

        return numMults;
    }
}
