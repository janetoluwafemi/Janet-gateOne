import java.util.Scanner;
public class TaskEigth{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int counter = 1;
		for(; counter <= 100; counter++){
			System.out.println("Enter valid number: ");
			int number = scanner.nextInt();
			if(number > 0 && number <= 100){
				sum += number;
				
			}
			
		}	
		System.out.print(sum);
		
	}
}