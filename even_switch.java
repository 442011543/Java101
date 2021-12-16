import java.util.Scanner;
public class even_switch {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int day;
        System.out.print("Enter a number : ");
        day = enter.nextInt();
        day %=2;

        switch (day) {
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");

        }












    }
}
