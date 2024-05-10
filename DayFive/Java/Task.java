import java.util.Arrays;
import java.util.Scanner;
	public class Task{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a valid number: ");
			String number = scanner.next();
			String result = answer(number);
			System.out.print(result);
		}
		public static String answer(String values){
			int finalResult;
			for(int counter = 0; counter < 19; counter++){
				for(int count = counter+1; count < 19; count++){
					if(counter > count){
						finalResult = counter;
						counter = count;
						count = finalResult;
				
						return "false";
					}
					else{
						return "true";
					}
				}
			}
			return values;
		}
	}	 