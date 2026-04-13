Problem 1.1 Write a function firstThree() that takes a string as input and returns a string containing only first three characters from the input string. Assume input string has at least 3 characters 


Input 				Return Value 
firstThree("abcd") 		"abc" 
firstThree("daycare") 	"day" 
 

Problem 1.2 Write a function printFirstThree() that takes a list of string as input and prints the first three characters of every string. 
Note: Use firstThree() function from problem 1.1 

Input 					Return Value 
printTotalA({"abef","abacd","bcd"}) 	abe 
						aba  
						bcd 
 
#####################################################################`
Problem 2.1 Write a function cleanString() that takes a string as input and return a new string containing only alphabets from input string. Assume string contains 
only lowercase letters or digits. 
Input 			Return Value 
cleanString("2mad3") 	"mad" 
 

Problem 2.2 Write a function print2() that takes a list of string as input and prints every string after cleaning (removing digits from them). 
Note: Use cleanString() function from problem 2.1 

Input 				Return Value 
print2(["ben10","2sad"]) 	ben 
				sad
 

######################################################################
Problem 3.1 Write a function numberSeries() that takes n as input and returns a string in following pattern: "123....n" NumberSeries 

Input 			Return Value 
numberSeries(2) 	"12" 
numberSeries(5) 	"12345" 
 
Problem 3.2 Write a function serieslist() that takes an array of integers as input and creates a new string list. Each integer n in array have a corresponding 
string number series "123.....n" stored at same location in string list. 
Note: Use numberSeries () function from problem 3.1 

Input 			Return Value 
serieslist([1,4,2]) 	["1","1234","12"]
