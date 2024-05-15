const prompt = require("prompt-sync")();
function creatingContact(){
	let createContact = [];
	firstName = prompt("Enter first name: ");
	lastName = prompt("Enter last name: ");
	phoneNumber = prompt("Enter your phone number: ");
	reply = prompt("Do you want to continue: ");
		if(reply.equals("yes")){
			phoneOption();
		}
			
	}
function removeOfContact(){
	let removeContact = [];
	personPhoneNumber = prompt("Enter your phone number: ");
	for(int counter = 0; counter < phoneNumber.size(); counter++){
		if(phoneNumber.get(counter).equals(personPhoneNumber)){
			phoneNumber.remove(scanner.next());
			firstName.remove(scanner.next());
			lastName.remove(scanner.next());
		}
	}
}
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
			}
		}

function findingContactByPhoneNumber(){
	let findContactByPhoneNumber = [];
	number = prompt("Enter phone number: ");
	for(int counter = 0; counter < phoneNumber.size(); counter++){
		if(number .equals(phoneNumber.get(counter))){
			console.log(firstName.get(counter));
			console.log(lastName.get(counter));
			console.log(phoneNumber.get(counter));
		}
	}
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
			}
		}
		
function findingContactByFirstName(){	
	let findContactByFirstName();
	firstName = prompt("Enter first name: ");
			firstName .add(scanner.next());
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				phoneNo = prompt("Enter phone number: ");
				if(phoneNo .equals(phoneNumber.get(counter))){
					console.log(firstName.get(counter));
					console.log(lastName.get(counter));
					console.log(phoneNumber.get(counter));
					
				}
			}
			
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
			}
		}

		public void findContactByLastName(){
			System.out.print("Enter last name: ");
			lastName .add(scanner.next());
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				phoneNo = prompt("Enter phone number: "){
				if(phoneNo .equals(phoneNumber.get(counter))){
					console.log(firstName.get(counter));
					console.log(lastName.get(counter));
					console.log(phoneNumber.get(counter));
					
				}
			}
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
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
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
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
		

		