const prompt = require("prompt-sync")();
	let userInput = prompt("Enter a valid number: ");
	let finalResult;
	let counter = 0;
	let count = counter+1;
	for(; counter < 19; counter++){
		for(; count < 19; count++){
			if(counter > count){
				finalResult = counter;
				counter = count;
				count = finalResult;
			}

		}
		
	}
	if(counter > count){
		console.log("False");
	}
	else{
		console.log("True");
	}



	