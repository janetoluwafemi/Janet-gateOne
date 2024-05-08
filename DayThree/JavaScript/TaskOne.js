const prompt = require("prompt-sync")();
let pass = 0;
let fail = 0;
let counter = 0;

for(; counter <= 10; counter++){
	let question = Math.floor(Math.random(10));
	question = prompt(Math.random()*20);
	let question1 = Math.floor(Math.random(20)); 
	question1 = prompt(Math.random()*10);
	let expectedAnswer = question + question1;
	answer = prompt("Question is: " + question + " + " + question1 + "\t");
	if(expectedAnswer == answer){
		pass++;
	}
	else{
		fail++;
	}
}
console.log("The total pass is" + pass);
console.log("The total fails is" + fail);
	

			 
			
		 