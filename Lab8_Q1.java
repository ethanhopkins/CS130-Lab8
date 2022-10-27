import java.util.*;

public class Lab8_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your choice (Any number from 1 to 7): ");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			if (choice == 1) {
				System.out.println("Monday");
			}
		break;
			
		case 2:
			if (choice == 2) {
				System.out.println("Tuesday");
			}
		break;
			
		case 3:
			if (choice == 3) {
				System.out.println("Wednesday");
			}
		break;
		
		case 4:
			if (choice == 4) {
				System.out.println("Thursday");
			}
		break;
		
		case 5:
			if (choice == 5) {
				System.out.println("Friday");
			}
		break;
		
		case 6:
			if (choice == 6) {
				System.out.println("Saturday");
			}
		break;
		
		case 7:
			if (choice == 7) {
				System.out.println("Sunday");
			}
		break;
		
		default:
			System.out.println("Invalid choice");
		}
	}

}
