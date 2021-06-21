package finalLabXm;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		int i, sum=0, lowerbound=1 ,upperbound=100;
		double average;
		
		for(i=lowerbound; i<=upperbound; i++) {
			
			sum+=i;
		}
		average = (1.0)*(sum)/100;
		
		System.out.println("sum of "+lowerbound+" to "+upperbound+" is "+sum);
		System.out.println("The average is "+average);
	}
}
