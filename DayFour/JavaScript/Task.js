const prompt = require("prompt-sync")();
let number = 0;
let userInput = []
	for(let counter = 0; counter < 9; counter++){
		number = prompt("Enter a number: ");

		userInput = prompt("Enter either x or o: " + "\t");
	}
	for(let counter = 0; counter < 9; counter++){
		for(let count = 0; count < 9; count++){
			console.log(userInput);
		}
		console.log(" ");
	}
			
	
	