

public class recapDemo2 {

	public static void main(String[] args) {
		
//		double[] myList = new double[4];
		double[] myList = {2.,1.,4.,3.};
		double sum = 0;
		double maxData = myList[0];
		
		for(double data:myList) {
			
			System.out.println(data);
			sum+=data;
			
			if(maxData<data) {
				maxData = data;
			}	
		}
		
		System.out.println("sum of datas = " + sum);
		System.out.println("max value = " + maxData);
		
	}

}
