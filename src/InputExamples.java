import java.util.Scanner;

public class InputExamples {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter Your Rollnumber : ");
		int rno=sc.nextInt();
		
		System.out.println("Enter Your Name  : ");
		String name=sc.next();
		
		System.out.println("Enter Percentage : ");
		double per=sc.nextDouble();
		
		
		System.out.println("Your Inputs ..........");
		
		System.out.println("Roll Number : "+rno);
		System.out.println("Your Name   : "+name);
		System.out.println("Your Per    : "+per);
		

	}

}
