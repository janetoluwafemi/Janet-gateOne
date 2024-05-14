import java.util.Scanner;
import java.util.ArrayList;
	public class FunctionForATMTaskTwo{
		private Scanner scanner = new Scanner(System.in);
		ArrayList<String> firstName = new <String>ArrayList();
		ArrayList<String> lastName = new <String>ArrayList();
		ArrayList<String> pin = new <String >ArrayList();
		ArrayList<String> accountNumber = new <String>ArrayList();
		ArrayList<Double> balance = new <Double>ArrayList();
 	
		
		public void creatingAccount(){
			System.out.print("Enter first name: ");
			firstName.add(scanner.next());

			System.out.print("Enter last name: ");
			lastName.add(scanner.next());
	
			System.out.print("Enter your account number: ");
			accountNumber.add(scanner.next());

			System.out.print("Enter your pin: ");
			pin.add(scanner.next());

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
		
		public void pin(){
			System.out.print("Enter your account number:");
			String account = scanner.next();
			System.out.print("Enter your old pin: ");
			String oldPin = scanner.next();
			for(int counter = 0; counter < account.size; counter++){
				if(account .equals(account.get(counter) && oldPin.equals(pin.get(counter)){
					System.out.print("Enter new pin:"){
					pin .set(scanner.next());
		
				}
			}

			

		}
		public void transfer(){
			System.out.print("Enter account number: ");
			String accountNo = scanner.next();
			System.out.print("Enter your pin: ");
			String actualPin = scanner.next();
			for(int counter = 0; counter < accountNumber; counter++){
				if(accountNo .equals(accountNo.get(counter) && actualPin.equals(pin.get(counter)){
					
					System.out.print("Enter your account number: ");
					personAccountNo .set(scanner.next());
					System.out.print("How much do you want to transfer:");
					double amount = scanner.nextInt());
					for(int counter = 0; counter < accountNumber.size; counter++){
						if(personAccountNo .equals(personAccountNo.get(counter)){
							double newBalance = amount + balance;
						}
					}
				}
			}
			
		}


			
		switch void creatingAccount();
			String creatingAccount = """
				1 -> System.out.print("deposit");
					break;
				2 -> System.out.print("withdraw");
					break;
				3 -> System.out.print("balance");
					break;
				4 -> System.out.print("transfer");
					break;
			""";

		
			
	 }