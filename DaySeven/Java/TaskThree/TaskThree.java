import java.util.Scanner;
	public class TaskThree{
		ArrayList<String> firstName = new <String>ArrayList();
		ArrayList<String> lastName = new <String>ArrayList();
		ArrayList<String> phoneNumber = new <String>ArrayList();
		public void addContact{
			System.out.print("Enter first name: ");
			firstName .add(scanner.next);
			System.out.print("Enter last name: ");
			lastName .add(scanner.next);
			System.out.print("Enter your phone number: ");
			phoneNumber .add(scanner.next);
		
			
		}
		public void removeContact{
			System.out.print("Enter your phone number: ");
			String personPhoneNumber = scanner.next;
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				if(phoneNumber .equals(personPhoneNumber)){
					phoneNumber .remove(scanner.next);
					firstName .remove(scanner.next);
					lastName .remove(scanner.next);
				}
			}
		}

		public void findContactByPhoneNumber{
			System.out.print("Enter phone number: ");
			String number = scanner.next();
			for(int counter = 0; counter < phoneNumber.size(); counter+=){
				if(number .equals(phoneNumber)){
					System.out.print(number);
				}
			}
		}
			
		public void findContactByFirstName{
			System.out.print("Enter first name: ");
			firstName .add(scanner.next);
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				System.out.print("Enter phone number: ");
				String phoneNo = scanner.next();
				if(phoneNo .equals(phoneNumber)){
																				phoneNumber .set(scanner.next);
					System.ouut.print(firstName);
					
				}
			}
		}

		public void findContactByLastName{
			System.out.print("Enter last name: ");
			lastName .add(scanner.next);
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				System.out.print("Enter phone number: ");
				String phoneNo = scanner.next();
				if(phoneNo .equals(phoneNumber)){
																				phoneNumber .set(scanner.next);
					System.ouut.print(lastName);
					
				}
			}
		}
	}
		

		