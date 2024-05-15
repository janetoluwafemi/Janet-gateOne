import java.util.ArrayList;
import java.util.Scanner;
	public class StudentsGrade{
		public static void main(String[] args){
		ArrayList<Integer> students = new ArrayList<>();
		ArrayList<Integer> scores = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("How many students do you have: ");
		int noOfStudent = scanner.nextInt();

		System.out.print("How many subjects do they offer: ");
		int noOfSubjects= scanner.nextInt();

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		
		for(int counter = 1; counter <= noOfStudent; counter++){
			System.out.println("Entering Score for Student "+ counter);
			for(int count = 1; count <= noOfSubjects; count++){
			System.out.print("Enter Score  for Subject "+ count + " ");
			int score = scanner.nextInt();
			scores.add(score);
			
			}
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		}
			
		
	}

}
		