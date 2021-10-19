import java.util.Scanner;
public class Mid {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        float var1;
        System.out.print("Enter a grade 0 to 100 : ");
        var1 = enter.nextFloat();
        if(var1 >= 90 && var1 <= 100){
            System.out.println(var1 + " is equivalent to A");
        }else if(var1 >=80 && var1 <=89){
            System.out.println("Good job with a "+ var1+" out of 100");
        }else if(var1 >=60 && var1<=79){
            System.out.println("Passed the course with "+var1+" out of 100");
        }else{
            System.out.println("Sorry you fail or you entered a wrong grade");
        }



    }
}
