import java.util.Scanner;
public class WeekEndAndWeekDaysSwitch {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int numb;
        System.out.print("Enter a number 1-7 : ");
        numb = enter.nextInt();

        switch (numb) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week days");
                break;
            case 6:
            case 7:
                System.out.println("Week end");
                break;
            default:
                System.out.println("error");

        }








    }
}
