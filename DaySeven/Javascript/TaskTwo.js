const prompt = require("prompt-sync")();
let contactList = []

function creatingContact(){
	let contact = [];
	let firstName = prompt("Enter first name: ");
	let lastName = prompt("Enter last name: ");
	let phoneNumber = prompt("Enter your phone number: ");
	contact.push(firstName);
	contact.push(lastName);
	contact.push(phoneNumber)
	contactList.push(contact);
	console.log("Contact added successfully");
	console.log(contactList);
}
function removeOfContact(){
	let removeContact = [];
	let personPhoneNumber = prompt("Enter your phone number: ");
	for(let counter = 0; counter < contactList.length(); counter++){
		if(contactList[counter][2] === personPhoneNumber){
			phoneNumber.remove(scanner.next());
			firstName.remove(scanner.next());
			lastName.remove(scanner.next());
		}
	}
	

}


function findContactByPhoneNumber(){
	let phoneNo = prompt("Enter phone number: ");
	for(let counter = 0; counter < contactList.length; counter++){
		if(contactList[counter][2] === phoneNo){
			console.log(contactList[counter]);
		}	
	}
	
}
		
function findingContactByFirstName(){	
	let firstName = prompt("Enter  first name: ");
	for(let counter = 0; counter < contactList.length(); counter++){
		phoneNo = prompt("Enter phone number: ");
		if(contactList[counter][0] === firstName){
			console.log(contactList[counter]);
					
		}
	}
			
}


function findContactByLastName(){
	let lastName = prompt("Enter last name: ");
	for(let counter = 0; counter < contactList.length(); counter++){
		phoneNo = prompt("Enter phone number: ");
		if(contactList[counter][1] === lastName){
			console.log(contactList[counter]);
					
		}
	}
}
function editContact(){
	let phoneContact = prompt("Enter your phone number: ");
			for(let counter = 0; counter < contactList.length(); counter++){
				if(contactList[counter][2] === phoneContact){
					let firstName = prompt  ("Enter your first name: ");
					let lastName = prompt("Enter your last name: ");
					let phoneNumber = prompt("Enter your phone number: ");
					
				}
			}
	

		}
		
		let loopCondition = true;
		
		while(loopCondition){
		console.log(" 1-> Add contact\n2 -> Remove contact\n3 -> Find contact by phone number\n4 -> Find contact by first name\n5 -> Find contact by last name\n6 -> Edit contact\n7-> Exit"); 
			//console.log(contactOption);
			let options = parseInt(prompt("Pick an option"));
			switch(options){
				case 1: creatingContact(); 
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
				case 7: loopCondition = false;
					break;
				default: console.log("Enter valid option");
			}
		}
	 		
	
		

		