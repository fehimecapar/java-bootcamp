import java.util.Scanner;

public class miniProject5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = obj.nextInt();
		boolean is_num_in_arr = false;
		
		int[] num_arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int number:num_arr) {
			
			if(number == num) {
				is_num_in_arr = true;
				break;
			}
		}
		
		if(is_num_in_arr == true) {
			
			System.out.println("number is in array");
			
		}else {
			
			System.out.println("number is not in array");
			
		}

	}

}
