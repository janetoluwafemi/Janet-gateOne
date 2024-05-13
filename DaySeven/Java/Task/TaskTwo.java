import java.util.Scanner;
	public class TaskTwo{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter first name: ");
			String firstName = scanner.nextLine();

			System.out.print("Enter last name: ");
			String lastName = scanner.nextLine();

			System.out.print("Enter your account number: ");
			int accountNumber = scanner.nextInt();
		
			System.out.print("Enter deposit amount: ");
			double depositAmount = scanner.nextDouble();

			System.out.print("Enter the amount you want to redraw: ");
			double amountWithdraw = scanner.nextDouble();

			System.out.print("Do you want to make a transfer: ");
			String transfer = scanner.nextLine();

	
			System.out.print("How much do you want to transfer: ");
			double amount = scanner.nextDouble();

			System.out.print("Which bank are you transfering to: ");
			String bankName = scanner.nextLine();

			System.out.print("Which account are you transfering to: ");
			int personAccountNumber = scanner.nextInt();

			double checkBalance = depositAmount - amountWithdraw;
			
			
			int pin;
			pin = 1234;
			System.out.print("Enter your pin:");
			int accountPin = scanner.nextInt();

			if(pin == accountPin){
				System.out.print("Transfer successful");
			}
			else{
				System.out.println("Wrong pin");
			}
			
			System.out.print("Do you want to change pin:");
			String changePin = scanner.nextLine();
			
			if(changePin == "yes"){
				System.out.print("Enter new pin:");
				int newPin = scanner.nextInt();
				pin = newPin;
			}
			
			double result = accountAmount(depositAmount, amountWithdraw);
			System.out.print(result);

			double result2 = balance(checkBalance, amount);
			System.out.print(result2);
		}
		
		public static double accountAmount(double depositAmount, double amountWithdraw){
			double checkBalance = depositAmount - amountWithdraw;
			return checkBalance;
		}

		public static double balance(double checkBalance, double amount){
			double balance = checkBalance - amount;

			return balance;
		}
	}		