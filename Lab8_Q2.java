import java.util.*;

public class Lab8_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int days;
		String name;
		
		System.out.println("Enter the place of the month (Example: February = 2nd month):");
		int month = scan.nextInt();
		
		System.out.println("Enter the year:");
		int year = scan.nextInt();
	
		
		switch (month) {
		case 1:
			name = "January";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 2:
			name = "February";
			
			if (year % 4 == 0) {
				System.out.println("The year " + year + " is a leap year");
				days = 29;
			} else {
				days = 28;
			}
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 3:
			name = "March";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 4:
			name = "April";
			days = 30;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 5:
			name = "May";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 6:
			name = "June";
			days = 30;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 7:
			name = "July";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 8:
			name = "August";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 9:
			name = "September";
			days = 30;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 10:
			name = "October";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 11:
			name = "November";
			days = 30;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		case 12:
			name = "December";
			days = 31;
			System.out.println(name + " " + year + " has " + days + " days");
		break;
		
		default:
			System.out.println("Invalid choice");
		}
		
		
	}

}
