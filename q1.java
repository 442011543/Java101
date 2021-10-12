import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float var1;
        System.out.print("Enter a Number : ");
        var1 = enter.nextFloat();
        var1 %=2;

        if(var1 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }

}
