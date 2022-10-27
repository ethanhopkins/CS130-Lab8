import java.util.*;

public class Lab8_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("\nThe sum of all 5 numbers is " + sum);
		
		float av = sum / 5;
		System.out.println("\nThe average of all 5 numbers is " + av);
	}

}
