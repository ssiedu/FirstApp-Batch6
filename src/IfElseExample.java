import java.util.Scanner;

public class IfElseExample {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter Percentage : ");
		double per=sc.nextDouble();
		
		System.out.println("Your Per    : "+per);
		
		if(per>=60) {
			System.out.println("I-Div");
		}else if(per>=45) {
			System.out.println("II-Div");
		}else if(per>=33) {
			System.out.println("III Div");
		}else {
			System.out.println("FAIL...");
		}
		
		

	}
}
