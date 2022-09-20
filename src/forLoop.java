

public class forLoop {

	public static void main(String[] args) {
		//For loop
		for(int i=0;i<10;i+=2) {
			
			System.out.println(i);
		}
		System.out.println("for loop done");
		
		System.out.println("\n***************************\n");
		
		//while loop
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while loop done");
		
		System.out.println("\n***************************\n");
		
		// Do-While loop
		i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<10);
		System.out.println("do-while loop done");
	}

}
