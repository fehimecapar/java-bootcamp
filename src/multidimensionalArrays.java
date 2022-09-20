

public class multidimensionalArrays {

	public static void main(String[] args) {
		
		String[][] cities = new String[2][2]; //3x3 matrix
		
		cities[0][0] = "Istanbul";
		cities[0][1] = "Ankara";
		cities[1][0] = "Gaziantep";
		cities[1][1] = "Adana";
		System.out.println("Cities");
		for(int i = 0; i<cities.length; i++) {
			for(int j=0; j<cities.length; j++) {
				System.out.println(cities[i][j]);
			}
			System.out.println("*****************************");
		}	

	}

}
