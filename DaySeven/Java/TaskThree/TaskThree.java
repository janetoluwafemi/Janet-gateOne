import java.util.ArrayList;
import java.util.Scanner;
	public class TaskThree{
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> firstName = new <String>ArrayList();
		ArrayList<String> lastName = new <String>ArrayList();
		ArrayList<String> phoneNumber = new <String>ArrayList();

		public void addContact(){
			System.out.print("Enter first name: ");
			firstName .add(scanner.next());
			System.out.print("Enter last name: ");
			lastName .add(scanner.next());
			System.out.print("Enter your phone number: ");
			phoneNumber .add(scanner.next());
		
			
		}
		public void removeContact(){
			System.out.print("Enter your phone number: ");
			String personPhoneNumber = scanner.next();
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				if(phoneNumber.get(counter).equals(personPhoneNumber)){
					phoneNumber .remove(scanner.next());
					firstName .remove(scanner.next());
					lastName .remove(scanner.next());
				}
			}
		}

		public void findContactByPhoneNumber(){
			System.out.print("Enter phone number: ");
			String number = scanner.next();
			 for(int counter = 0; counter < phoneNumber.size(); counter++){
				if(number .equals(phoneNumber.get(counter))){
					System.out.print(firstName.get(counter));
					System.out.print(lastName.get(counter));
					System.out.print(phoneNumber.get(counter));
				}
			}
		}
			
		public void findContactByFirstName(){
			System.out.print("Enter first name: ");
			firstName .add(scanner.next());
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				System.out.print("Enter phone number: ");
				String phoneNo = scanner.next();
				if(phoneNo .equals(phoneNumber.get(counter))){
					System.out.print(firstName.get(counter));
					System.out.print(lastName.get(counter));
					System.out.print(phoneNumber.get(counter));
					
				}
			}
		}

		public void findContactByLastName(){
			System.out.print("Enter last name: ");
			lastName .add(scanner.next());
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				System.out.print("Enter phone number: ");
				String phoneNo = scanner.next();
				if(phoneNo .equals(phoneNumber.get(counter))){
					System.out.print(firstName.get(counter));
					System.out.print(lastName.get(counter));
					System.out.print(phoneNumber.get(counter));
					
				}
			}
		}
		public void editContact(){
			System.out.print("Enter your phone number: ");
			String phoneContact = scanner.next();
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				if(phoneContact .equals(phoneNumber.get(counter))){
					System.out.print("Enter your first name: ");
					firstName.set(counter, scanner.next());
					System.out.print("Enter your last name: ");
					lastName.set(counter, scanner.next());
					System.out.print("Enter your phone number: ");
					phoneNumber.set(counter, scanner.next());
					
				}
			}
		}

		public void phoneOption(){
			String contactOption = """ 
				1 -> Add contact
				2 -> Remove contact
				3 -> Find contact by phone number
				4 -> Find contact by first name
				5 -> Find contact by last name
				6 -> Edit contact
			"""; 
			System.out.print(contactOption);
			int options = scanner.nextInt();
			switch(options){
				case 1: addContact(); 
					break;
				case 2: removeContact();
					break;
				case 3: findContactByPhoneNumber();
					break;
				case 4: findContactByFirstName();
					break;
				case 5: findContactByLastName();
					break;
				case 6: editContact();
					break;
			}

		}  		
	}
		

		