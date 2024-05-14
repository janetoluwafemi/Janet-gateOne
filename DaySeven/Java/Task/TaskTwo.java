import java.util.Scanner;
	public class TaskTwo{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			double depositAmount = 0.0;
			double withdrawAmount = 0.0;
			double transferAmount = 0.0;
			
			System.out.println("Welcome To Semicolon Bank");
			System.out.print("Do you want to create an account:");
			String reply = scanner.next();
			if(reply .equals("yes")){
				System.out.print("Enter first name: ");
				String firstName = scanner.next();

				System.out.print("Enter last name: ");
				String lastName = scanner.next();

				System.out.print("Enter your account number: ");
				String accountNumber = scanner.next();
				System.out.println("1.deposit  2.withdraw  3.transfer.");
				String answer = scanner.next();
				if(answer .equals("deposit")){
					System.out.print("Enter deposit amount: ");
					depositAmount = scanner.nextDouble();
				}
				if(answer .equals("withdraw")){
					System.out.print("Enter the amount you want to redraw: ");
					withdrawAmount = scanner.nextDouble();

				}
				if(answer .equals("transfer")){ 
					System.out.print("How much do you want to transfer: ");
					transferAmount = scanner.nextDouble();
				
					System.out.print("Which bank are you transfering to: ");
					String bankName = scanner.next();

					System.out.print("Which account are you transfering to: ");
					String personAccountNumber = scanner.next();
				}


				double checkBalance = depositAmount - withdrawAmount;
				double amount = checkBalance - transferAmount;
			
			
				int pin;
	
				System.out.print("Enter your pin:");
				int accountPin = scanner.nextInt();

			
				System.out.print("Do you want to change pin:");
				String changePin = scanner.next();
			 
				if(changePin .equals("yes")){
					System.out.print("Enter new pin:");
					int newPin = scanner.nextInt();
					pin = newPin;
				}
			
				double result = accountAmount(depositAmount, withdrawAmount);
				System.out.print(result);

				double result2 = balance(checkBalance, amount);
				System.out.print(result2);
			}
		}
		
			public static double accountAmount(double depositAmount, double withdrawAmount){
				double checkBalance = depositAmount - withdrawAmount;

				return checkBalance;
			}

			public static double balance(double checkBalance, double amount){
				double balance = checkBalance - amount;
	
				return balance;
			//still thinking

			
		}
	}		