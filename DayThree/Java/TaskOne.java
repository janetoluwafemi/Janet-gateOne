import java.util.Scanner;
import java.util.Random;
	public class TaskOne{
		public static void main(String[] args){
			Random rand = new Random(); 

			Scanner scanner = new Scanner(System.in);
			int pass = 0;
			int fail = 0;
			int counter = 0;
			
			for(; counter <= 10; counter++){
				int question = rand.nextInt(10);
				int question1 = rand.nextInt(50);
				int expectedAnswer = question + question1;
				System.out.print("Question is: " + question + " + " + question1 + "\t");
				int answer = scanner.nextInt();
			
				if(expectedAnswer == answer){
					pass++;
					System.out.println("correct");
				}
				else{
					fail++;
					System.out.println("incorrect");
				}
			}
			System.out.println(pass);
		

			System.out.println(fail); 
			
		}

	}

			
			
		
		