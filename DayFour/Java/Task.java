import java.util.Arrays;
import java.util.Scanner;
	public class Task{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			String[] input = new String[9];
			int number = 0;
			String userInput;
			for(int counter = 0; counter < input.length; counter++){
				System.out.print("Enter a number: ");
				number = scanner.nextInt();

				System.out.print("Enter either x or o: " + "\t");
				userInput = scanner.next();
				if(userInput == "x" && userInput == "o"){
					System.out.print(userInput);
				}
				else{
					System.out.print("Invalid");
				}

			}
			for(int counter = 0; counter < input.length; counter++){
				for(int count = 0; count < input.length; count++){
				System.out.print(userInput);
					System.out.print(" ");
				}
			}
				
			
			
		}

	}				
				