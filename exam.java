public class exam {
    public static void main(String[] args) {
        int counter;
        counter = 100;
        while (counter >= -100) {
            if (counter % 2 == 0) {
                System.out.println(counter + " % 2 is even");
            } else {
                System.out.println(counter + " % 2 is odd");
            }
            counter--;
        }
    }
}
