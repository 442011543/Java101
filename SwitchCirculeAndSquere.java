import java.util.Scanner;
public class SwitchCirculeAndSquere {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int numb;
        float var1,var2;
        System.out.print("Enter a Number 1 or 2 : ");
        numb = enter.nextInt();
        switch (numb) {
            case 1:
                System.out.print("Enter a Radius : ");
                var1 = enter.nextFloat();
                System.out.print("Sircle size = "+ (var1 * var1 * 3.14));
                break;
            case 2:
                System.out.print("Enter a height : ");
                var1 = enter.nextFloat();
                System.out.print("Enter a width : ");
                var2 = enter.nextFloat();
                System.out.println("Area size = " + (var1 * var2));
                break;
            default:
                System.out.print("Error !! enter number 1 or 2 ");


        }


    }
}
