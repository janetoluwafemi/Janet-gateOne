import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int even = 0;
		for(int counter = 1; counter <= 10; counter++){
			System.out.println("Enter score" + counter);
			int scores = scanner.nextInt();
			if(scores % 2 == 1){
				sum += scores;
			
			}
		}
		System.out.print(sum);
		
	}
}