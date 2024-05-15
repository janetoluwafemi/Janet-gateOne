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
			System.out.print(

		}
		public void deposit(){
			System.out.print("Enter the account number: ");
			String userAccountNumber = scanner.next();
			System.out.print("How much do you want to deposit: ");
			double depositAmount = scanner.nextDouble();
			for(int counter = 0; counter < accountNumber.size(); counter++){
				if(accountNumber .equals(accountNumber.get(counter))){ 	
					balance.set(counter,depositAmount + balance.get(counter));
				}
			}
			
		}
		public void withdraw(){
			System.out.print("Enter the account number: ");
			String accountNumber1 = scanner.next();	

			System.out.print("How much do you want to withdraw: ");
			double amountWithdrawn = scanner.nextDouble();
			for(int counter = 0; counter < accountNumber.size(); counter++){
				if(accountNumber1 .equals(accountNumber.get(counter))){ 
					balance.set(counter,balance.get(counter) - amountWithdrawn);
				}
			}
		}
		public void balance(){
			System.out.print("Enter your account number: ");
			String accountNo = scanner.next();
			for(int counter = 0; counter < accountNumber.size(); counter++){
				if(accountNo .equals(accountNumber.get(counter))){ 
					System.out.print(firstName.get(counter));
					System.out.print(lastName.get(counter));
					System.out.print(accountNo);
					System.out.print(balance.get(counter));
				}
			}
		}
		public void pin(){
  			System.out.print("Enter your account number:");
			String account = scanner.next();
			System.out.print("Enter your old pin: ");
			String oldPin = scanner.next();
			for(int counter = 0; counter < accountNumber.size(); counter++){
				if(account .equals(account) && oldPin.equals(pin)){
					System.out.print("Enter new pin:");
					String newPin = scanner.next();
		
				}
			}

			

		}
		public void transfer(){
			System.out.print("Enter account number: ");
			String accountNo = scanner.next();
			System.out.print("Enter your pin: ");
			String actualPin = scanner.next();
			
			for(int counter = 0; counter < accountNumber.size(); counter++){
				if(accountNo .equals(accountNo) && actualPin.equals(pin)){
					
					System.out.print("Enter your account number: ");
					String personAccountNo = scanner.next();
					//personAccountNo .set(scanner.next());
					System.out.print("How much do you want to transfer:");
					double amount = scanner.nextInt();
					for(int count = 0; count < accountNumber.size(); count++){
						if(personAccountNo .equals(personAccountNo)){
							balance.set(counter,amount + balance.get(counter));
						}
					} 
				}
			}
			
		}


			
		public void accountOption(){
			String ATMOption = """
				1 -> create account;
				2 -> deposit money;
				3 -> withdraw money;
				4 -> check account balance;
				5 -> transfer;
				6 -> change pin;
					
			""";

			System.out.print(ATMOption);
			int options = scanner.nextInt();
			switch(options){
				case 1: creatingAccount();
					break;
				case 2: deposit();
					break;
				case 3 : withdraw();
					break;
				case 4 : balance();
					break;
				case 5 : transfer();
					break;
				case 6 : pin();
					break;
			}
			
		}
		
}