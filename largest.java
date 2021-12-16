import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        float var1,var2,var3;

        System.out.println("Enter Number 1 : " );
        var1 = myScanner.nextFloat();
        System.out.println("Enter Number 2 : " );
        var2 = myScanner.nextFloat();
        System.out.println("Enter Number 3 : " );
        var3 = myScanner.nextFloat();

        if(var1 > var2 && var1 > var3) {
            System.out.println("The Largest Number =" + var1);
        }
        else if (var2 > var1 && var2 > var3){
            System.out.println("The Largest Number =" + var2);
        }
        else if (var3 > var1 && var3 > var2) {
            System.out.println("The Largest Number =" + var3);
        }





    }

}
