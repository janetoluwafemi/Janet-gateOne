const prompt = require("prompt-sync")();
let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
for(let counter = 0; counter < numbers.length; counter++){
	let even = numbers[0];
	if(counter % 2 == 0){
		even[counter] = numbers[counter];
	};

	console.log(even)
}