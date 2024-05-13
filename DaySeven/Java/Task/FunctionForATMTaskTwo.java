import java.util.Scanner;
import java.util.ArrayList;
	public class FunctionForATMTaskTwo{
		private Scanner scanner = new Scanner(System.in);
		ArrayList<String> firstName = new <String>ArrayList();
		ArrayList<String> lastName = new <String>ArrayList();
		ArrayList<Integer> pin = new <Integer>ArrayList();
		ArrayList<String> accountNumber = new <String>ArrayList();
		ArrayList<Double> balance = new <Double>ArrayList();
 		String accountNumber = "";
		double balance = 0.0;
		int pin = 0;
		
		public void creatingAccount(){
			System.out.print("Enter first name: ");
			firstName.add(scanner.next());

			System.out.print("Enter last name: ");
			lastName.add(scanner.next());
	
			System.out.print("Enter your account number: ");
			accountNumber.add(scanner.next());

			System.out.print("Enter your pin: ");
			pin.add(scanner.nextInteger());

			balance.add(0.0);

		}
		public void deposit(){
			System.out.print("Enter the account number: ");
			String userAccountNumber = scanner.nextInt();
			System.out.print("How much do you want to deposit: ");
			double depositAmount = scanner.nextDouble();
			for(int counter = 0; counter < accountNumber; counter++){
				if(accountNumber .equals(accountNumber.get(counter)){ 	
					double balance.set(counter,depositAmount + balance.get(counter));
				}
			}
			
		}
		public void withdraw(){
			System.out.print("Enter the account number: ");
			String accountNumber = scanner.nextInt();	

			System.out.print("How much do you want to withdraw: ");
			double amountWithdrawn = scanner.nextDouble;
			for(int counter = 0; counter < accountNumber; counter++){
				if(accountNumber .equals(accountNumber.get(counter)){ 
					double balance.set(counter,amountBalance.get(counter) - amountWithdrawn);
				}
			}
		}
		public void balance(){
			System.out.print("Enter your account number: ");
			String accountNo = scanner.next();
			for(int counter = 0; counter < accountNumber; counter++){
				if(accountNo .equals(accountNumber.get(counter)){ 
					System.out.print(firstName.get(counter));
					System.out.print(lastName.get(counter));
					System.out.print(accaountNo.get(counter));
					System.out.print(balance.get(counter));
				}
			}
		}
	
		
			

		
		
			
	 }