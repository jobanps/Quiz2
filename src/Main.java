import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter number of weeks : ");
		int numberOfWeeks = input.nextInt();
		
		int numberOfDays = numberOfWeeks * 7;
		
		int infectedCount = 0;
		
		
		for(int day=1; day<= numberOfDays ; day++) {
			
			if(day == 1){
				infectedCount = 1;
			} else {
				
				infectedCount = infectedCount + 5;
			}
			
			
			if(day%7 == 0) {
				
				System.out.println("Number of infected instructors after week " + (day/7) + " : " + infectedCount );
			}
			
		}
		
		
		
		System.out.println("Total Number of infected instructors : " + infectedCount );
		

	}

}
