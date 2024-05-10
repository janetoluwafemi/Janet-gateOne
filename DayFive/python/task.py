
finalResult = 0;
number = input("Enter a valid number: ")
if(len(number) != 16):
	print("false")
else:
	print("true")
for counter in range(19):
	for count in range(counter+1):                              
		if(counter > count):
			finalResult = counter
			counter = count
			count = finalResult

if(counter > count):
	print("False")
	
else:
	print("true")