

public class recapDemo1 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 25;
		int num3 = 290;
		int maxNum = num1;
		
		if(maxNum <num2) {
			maxNum = num2;	
		}
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		System.out.println("the biggest number is " + maxNum);

	}

}
