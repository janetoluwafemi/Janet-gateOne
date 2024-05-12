import java.util.Arrays;
import java.util.Scanner;
	public class Task{
		public static void main(String[] arg){
			Scanner scanner = new Scanner(System.in);
			String[] array = new String[10];
			System.out.print("Enter date of birth: ");
			String dateOfBirth = scanner.nextLine();

			System.out.print("Enter month of birth: ");
			String monthOfBirth = scanner.nextLine();
			
			String currentDate = "05/12/2024";

			String wording = dateOfBirth.substring(1,2);
			String words = dateOfBirth.substring(4,5);
			String wordings = dateOfBirth.substring(7,8);
			
			int age = 0;
		
			age = .now().getvalue()-dateOfBirth;
			if(dateOfBirth.equalsIgnoreCase(currentDate)){
				age--;
			}
			else{
				age++;
			}
			System.out.print(age);
		}
	}			 
			
			 