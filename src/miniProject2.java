import java.util.Scanner;

public class miniProject2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter Upper char: ");
		char inputChar = obj.next().charAt(0);
		
		switch(inputChar) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("bold char");
				break;
			default:
					System.out.println("thin char");
				
			}

	}

}
