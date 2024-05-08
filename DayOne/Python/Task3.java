import java.util.Scanner;
	public class Task3{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);

			int weigthInPound = 0.45359237;
			int heigthInPound = 0.0254;

			System.out.print("Enter weigth in pounds: ");
			double weigth = scanner.nextDouble();
	
			System.out.print("Enter heigth in inches: ");
			double heigth = scanner.nextDouble();

			int weigthAns = weigth * 0.45359237;
			int heigthAns = heigth * 0.0254;

			int heigthSolution = heigthAns * heigthAns;

			int mbi = weigthAns / heigthSolution;

			System.out.print("The MBI is: " + mbi);
		}


	} 

			




			