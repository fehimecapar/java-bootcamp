import java.util.Scanner;

public class miniProject3 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = obj.nextInt();
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				sum+=i;
			}			
		}
		
		if(sum == num) {
			System.out.println(num + " is perfect number :)");
		}else {
			System.out.println(num + " is not perfect number :(");
		}

	}

}
