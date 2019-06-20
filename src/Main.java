public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s1 = "";
        for(int i=0; i<50000; i++) {
            s1 += "Loading ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("String time was " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<50000; i++) {
            s2.append("Loading ");
        }
        endTime = System.currentTimeMillis();

        System.out.println("String Builder time was " + (endTime - startTime) + " milliseconds.");

        startTime = System.currentTimeMillis();
        StringBuffer s3 = new StringBuffer();
        for(int i=0; i<50000; i++) {
            s3.append("Loading ");
        }
        endTime = System.currentTimeMillis();

        System.out.println("String Buffer time was " + (endTime - startTime) + " milliseconds.");
    }
}
