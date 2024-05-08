import java.util.Scanner;
public class TaskTwo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int average = 0;
		for(int counter = 1; counter <= 10; counter++){
			System.out.println("Enter score" + counter);
			int scores = scanner.nextInt();
			sum += scores;
			average = sum / 10;
		}
		System.out.println(sum);
		System.out.print(average);
	}
}