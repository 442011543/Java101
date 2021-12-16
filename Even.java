import java.util.Scanner;
public class Even{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int var1;
        System.out.print("Enter a Number: ");
        var1 = myScanner.nextInt();

        var1 %=2;

        if ( var1 == 0 ) {
            System.out.println("even");
        }else{ System.out.println("odd");}


    }
}
