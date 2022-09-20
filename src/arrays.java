
public class arrays {

	public static void main(String[] args) {
		
		String[] students = new String[3]; // 3 elemanlı String tipli bir dizi tanımlanır
		
		students[0] = "Fehime";
		students[1] = "Ersin";
		students[2] = "Baki";
//		for(int i = 0; i<students.length; i++) {
//			System.out.println(students[i]);
//		}
		
		for(String student:students) {
			System.out.println(student);
		}

	}
}
