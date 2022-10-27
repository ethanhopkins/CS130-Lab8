import java.util.*;

public class Lab8_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> new_list = new ArrayList<>();
		new_list.add(23);
		new_list.add(8);
		new_list.add(31);
		new_list.add(45);
		new_list.add(6);
		new_list.add(7);
		new_list.add(19);
		new_list.add(15);
		
		for (int i = 0; i < 2; i++) {
			if (new_list.get(i) < 10 || new_list.get(i) > 20) {
				new_list.remove(i);
				i--;
			} else {
				System.out.println(new_list.get(i));
			}
		}
		
	}

}
