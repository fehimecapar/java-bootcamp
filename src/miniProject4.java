import java.util.Scanner;

public class miniProject4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter 2 number: ");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		int sum1 = 0;
		for(int i=1; i<num1; i++) {
			if(num1%i == 0) {
				sum1 += i;
			}			
		}
		
		int sum2 = 0;
		for(int i=1; i<num2; i++) {
			if(num2%i == 0) {
				sum2 += i;
			}			
		}
		
		if(num1 == sum2 && num2 == sum1) {
			System.out.println(num1 + " ve " + num2 + " arkadaş sayılardır");
		}
		else {
			System.out.println(num1 + " ve " + num2 + " arkadaş sayılar değildir");
		}


	}

}
