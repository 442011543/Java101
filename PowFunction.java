import java.util.Scanner;
public class PowFunction {
    static float pow(float x){
        return x * x;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        System.out.print(pow(scan.nextFloat()));

    }
}
