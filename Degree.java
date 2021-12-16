import java.util.Scanner;
public class Degree
{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		float var1;
		System.out.print("Enter a Number From 0 to 100 :");
		var1 = myScanner.nextFloat();
		
		if (var1 >=0 && var1<=59) {
		    System.out.println("F"); }
		
		else if (var1 >=60 && var1<=69) {
		    System.out.println("D"); }
		
		else if (var1 >=70 && var1<=79) {
		    System.out.println("C"); }
		
		else if (var1 >=80 && var1<=89) {
		    System.out.println("B"); }
		    
		else if (var1 >=90 && var1<=100) {
		    System.out.println("A"); }
		    
		else { System.out.println("Error !! You Should Enter Num Betwen 0 - 100"); }
		    
		     
		    
		}
		
		
	}
