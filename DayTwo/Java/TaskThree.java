import java.util.Arrays;
import java.util.Scanner;
	public class TaskThree{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int counter = 0;
			int[] array = new int[10];
			for(; counter < 10; counter++){
				
				System.out.print("Enter score: ");
				int score = scanner.nextInt();
	
				array[counter] = score;
			}
				System.out.print(Arrays.toString(array));
			

		}

	}