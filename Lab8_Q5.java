import java.util.*;

public class Lab8_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color = new ArrayList<>();
		color.add("red");
		color.add("green");
		color.add("orange");
		color.add("white");
		color.add("black");
		
		if (color.contains("red")) {
			System.out.println("The color red is found within the list at index " + color.indexOf("red"));
		}
	}

}
