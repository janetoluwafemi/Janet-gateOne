import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int even = 0;
		int counter = 1;
		int average = 0;
		for(; counter <= 10; counter++){
			System.out.println("Enter score" + counter);
			int scores = scanner.nextInt();
			if(scores % 2 == 0){
				sum += scores; 
		
				average = sum / 10;
			}
		}	
		System.out.print(average);
		
	}
}