import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String computerPlays = "rps";
        String enter;
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            enter = scan.nextLine();
            enter = enter.toLowerCase();
            char digit = enter.charAt(0);
            if(digit == 'r' || digit =='p' || digit =='s'){

            }else{
                break;
            }
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            if(digit == 'r' && computerChoice == 'r' || digit =='p' && computerChoice=='p' || digit =='s' && computerChoice =='s'){
                System.out.println(digit +" | "+ computerChoice +" Tie !!");
            }else if(digit =='r' && computerChoice =='s' || digit =='p' && computerChoice =='r' || digit == 's' && computerChoice == 'p'){
                System.out.println(digit +" | "+ computerChoice +" You won !!");
            }else{
                System.out.println(digit +" | "+ computerChoice +" Computer won !!");
            }
            System.out.println("\n\n");
        }while(true);
    }
}
