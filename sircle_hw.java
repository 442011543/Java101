import java.util.Scanner;
public class sircle_hw {
        public static void main(String[] args) {
            Scanner enter = new Scanner(System.in);
            int var1;
            float var2,var3;
            System.out.print("Enter a Number 1 or 2 : ");
            var1 = enter.nextInt();


            if(var1 ==1){
                System.out.print("Enter a radius : ");
                var2 = enter.nextFloat();
                System.out.println( "Sircle Size = " + (var2 * var2 * 3.16));

            }else if(var1 == 2){
                System.out.print("Enter a height : ");
                var2 = enter.nextFloat();
                System.out.print("Enter a width : ");
                var3 = enter.nextFloat();
                System.out.println("The area = "+ (var2 * var3 ));


            }else{
                System.out.println("Error !! enter 1 or 2");
            }


        }
}
