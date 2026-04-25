Example 5: ArrayList traversal : Iterator based approach

//Assume ArrayList : numbers<Integer> contains [12, 13, 9, 10]
Iterator itr = numbers.iterator();		//getting ArrayList iterator


while(itr.hasNext())			//checking if we are at end
{
int n = itr.next();			//getting next element & moving forward
System.out.println(n);
}



Output:
12
13
9
10

Problem 5
-----------
Give output of following code.

ArrayList<Character> alphabets = new ArrayList<Character>();
alphabets.add('A');
alphabets.add('C');
alphabets.add('D');
alphabets.add('E');
alphabets.set(0, 'B');
Iterator itr = alphabets.iterator();
while(itr.hasNext())
{
char ch = itr.next();
System.out.println(ch);
}



For-each loop skips the indexes.

Example 6.1: For-each loop to traverse Arrays

int arr = {12, 9, 16, 13}
for(int item : arr)	//Read: for every "item" in "arr"
{
System.out.println(item);		//variable name "item" can be changed
}


Output:

Example 6.2: For-each loop to traverse ArrayList

//Assume ArrayList : names<String> contains [Salman, Anushka, Randeep]
for(String str : names)		//for every element str in names
{
System.out.println("Star Cast: " + str);
}

Output:



Problem 6
----------

Give output of following code.

//Assume ArrayList : numbers<Integer> contains [2, 7, 4, 1, 5]
for(int num : numbers)
{
if(num < 5)
{
System.out.println(num);
}
}

Problem 7
----------
Give output of following code.

Assume ArrayList : numbers<Integer> contains [8, 3, 6, 1]

Replace element at index 2 with value 10
Traverse the ArrayList using Iterator
Print only those elements which are greater than 5

Problem 8
----------
Give output of following code.

Assume ArrayList : names<String> contains [Aman, Raj, Sita, Om]

Traverse the ArrayList using for-each loop
Print only those names whose length is greater than 3
