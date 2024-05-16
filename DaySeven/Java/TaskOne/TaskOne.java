import java.time.LocalDate;
import java.util.Scanner;
	public class TaskOne{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("What is your name: ");
			String name = scanner.next();

			System.out.print("How old are you?");
			int age = scanner.nextInt();

			System.out.print("At what age did your menstruation begin");
			int menstruationAge = scanner.nextInt();
			
			System.out.print("How many days was your menstruation");
			int numberOfDays = scanner.nextInt();

			System.out.print("Which day did you menstruate last");
			int lastPeriodDay = scanner.nextInt();

			System.out.print("Which month did you menstruate last");
			int lastPeriodStartDateMonth = scanner.nextInt();

			System.out.print("What year did you menstruate last");
			int lastPeriodStartDateYear = scanner.nextInt();

			System.out.print("What is your average cycle");
			long averageCycle = scanner.nextInt();


			LocalDate lastPeriodStartDate11 = LocalDate.of(lastPeriodDay, lastPeriodStartDateMonth, lastPeriodStartDateYear);
			LocalDate nextPeriod = lastPeriodStartDate11.plusDay(averageCycle);

			System.out.print("Hello" + name + "You next menstraution period is" + nextPeriod);
		}

	}

		
