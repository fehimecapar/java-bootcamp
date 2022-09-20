

public class switchCase {

	public static void main(String[] args) {

		char grade = 'M';

		switch (grade) {

		case 'A':
			System.out.println("the best");
			break;
		case 'B':
			System.out.println("very good");
			break;
		case 'C':
			System.out.println("good");
			break;
		case 'D':
			System.out.println("not bad");
			break;
		case 'F':
			System.out.println("failed");
			break;
		default:
			System.out.println("invalid");

		}

	}

}
