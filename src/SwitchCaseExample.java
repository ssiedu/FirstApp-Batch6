import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//ask a state from user and show its capital
		
		System.out.println("Enter State Name : ");
		String state=sc.next();
		
		switch(state) {
		case "MP":
			System.out.println("Bhopal");
		break;
		case "MH":
			System.out.println("Mumbai");
		break;
		case "RJ":
			System.out.println("Jaipur");
		break;
		}
		
		
		
	}
}
