import java.util.Scanner;

public class miniProject1 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = obj.nextInt();
		boolean isPrime = false;
		if(num <= 1) {
			System.out.println(num + " is not prime number");
			return;
		}
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
			
				isPrime = true;
			}
		}
		
		if(isPrime) {
			
			System.out.println(num + " is not prime number");
			
		}else {
			
			System.out.println(num + " is prime number");
		}
		
	}

}
