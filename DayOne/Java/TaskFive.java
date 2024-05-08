import java.util.Scanner;
public class TaskFive{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int odd = 0;
		int counter = 1;
		for(; counter <= 10; counter++){
			System.out.println("Enter score" + counter);
			int scores = scanner.nextInt();
			if(scores % 2 == 1){
				sum += scores; 	
				
			}			 
		}	
		System.out.print(sum);
		
	}
}