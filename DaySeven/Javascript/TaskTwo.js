const prompt = require("prompt-sync")();
function creatingContact(){
	let createContact = [];
	let firstName = prompt("Enter first name: ");
	let lastName = prompt("Enter last name: ");
	let phoneNumber = prompt("Enter your phone number: ");

	reply = prompt("Do you want to continue: ");
	if(reply.equals("yes")){
		phoneOption();
			
	}
}
function removeOfContact(){
	let removeContact = [];
	let personPhoneNumber = prompt("Enter your phone number: ");
	for(int counter = 0; counter < phoneNumber.size(); counter++){
		if(phoneNumber.get(counter).equals(personPhoneNumber)){
			phoneNumber.remove(scanner.next());
			firstName.remove(scanner.next());
			lastName.remove(scanner.next());
		}
	}

	reply = prompt("Do you want to continue: ");
	if(reply.equals("yes")){
	 	phoneOption();
	}
}


functilet on findingContactByPhoneNumber(){
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
	let firstName = prompt("Enter first name: ");
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


fuction findContactByLastName(){
	let lastNamw = prompt("Enter last name: ");
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
function editContact(){
	let phoneContact = prompt("Enter your phone number: ");
			for(int counter = 0; counter < phoneNumber.size(); counter++){
				if(phoneContact .equals(phoneNumber.get(counter))){
					let firstName = prompt  ("Enter your first name: ");
					let lastName = prompt("Enter your last name: ");
					let phoneNumber = prompt("Enter your phone number: ");
					
				}
			}
			reply = prompt("Do you want to continue: ");
			if(reply.equals("yes")){
				phoneOption();
			}
		}

		public void phoneOption(){
			let contactOption = """ 
				1 -> Add contact
				2 -> Remove contact
				3 -> Find contact by phone number
				4 -> Find contact by first name
				5 -> Find contact by last name
				6 -> Edit contact
			"""; 
			console.log(contactOption);
			let options = prompt("Pick an option");
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
		

		