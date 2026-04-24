# ArrayList Class
________________

Syntax:
ArrayList<ClassName> list_name = new ArrayList<ClassName>();

Example 1: Creating Simple ArrayList
ArrayList<Integer> arrList1 = new ArrayList<Integer>();
ArrayList<String> arrList2 = new ArrayList<String>();



Basic Methods: add() and size()
________________________________

Example 2: Using simple methods

ArrayList<String> countries = new ArrayList<String>();
countries.add("India");
countries.add("China");		//add element at the end of ArrayList

int len = countries.size();	//get current size of our ArrayList


System.out.println(len);
countries.add("Pakistan");
len = countries.size();
System.out.println(len);		//size automatically increases
System.out.println(countries);	//printing our ArrayList

Output:





Problem 1
----------
Give output of following code.

ArrayList<String> fruits = new ArrayList<String>();
fruits.add("Banana");
fruits.add("Apple");
int len = fruits.size();
System.out.println(len);
fruits.add("Orange");
len = fruits.size();
System.out.println(len);
System.out.println(fruits);


Getting and Setting elements at specific index.
________________________________________________

Example 3.1: Demonstrating Operations – Getting and Setting elements at specific index

//Assume ArrayList : marks<Integer> contains [70, 65, 33, 94]
int len = marks.size();		
System.out.println(len);
System.out.println(marks);
int m1 = marks.get(1);			//getting Integer at 1st index (2nd element).
System.out.println(m1);
marks.set(2, 40);				//Setting 40 at 2nd index.

System.out.println(marks);

Output:



Example 3.2: Example to Demonstrate IndexOutOfBoundsException

// Let's create an ArrayList of characters. We'll use Character class.
ArrayList<Character> arrList = new ArrayList<Character>();
arrList.add('T');		//adding our first Character
arrList.add('R');


int len = arrList.size();
System.out.println(len);
arrList.set(-1, 40);		//Setting 40 at index less than 0
arrList.get(4);			//get element at 4th index

System.out.println(arrList);

Output:



Problem 2
----------
Give output of following code.

ArrayList<Integer> arrList = new ArrayList<Integer>();
arrList.add(30);
arrList.add(40);
arrList.add(10);
arrList.add(50);
int len = arrList.size();
System.out.println(len);
System.out.println(arrList);
int num = arrList.get(0);
System.out.println(num);
arrList.set(1, num + 5);
arrList.set(2, num + 10);
arrList.set(3, num + 15);
System.out.println(arrList);



Problem 3
----------

Give output of following code.

ArrayList<String> whitelist = new ArrayList<String>();
whitelist.add("Rohan");
whitelist.add("Neha");
int len = whitelist.size();
System.out.println(len);
whitelist.set(0, "Mohan");
whitelist.set(2, "Shivani");
System.out.println(whitelist);


Example 4: Index based ArrayList traversal

//Assume ArrayList : numbers<Integer> contains [12, 13, 9, 10]
int len = numbers.size();
for(int i = 0; i < len; i++)
{
int num = numbers.get(i);
System.out.println("Number at index " + i + " is " + num);
num = num + 5;
numbers.set(i, num);	//adding 5 to elements at same index


}
System.out.println(numbers);

Output:



Problem 4
----------
Give output of following code.

ArrayList<Integer> arrList = new ArrayList<Integer>();
int arr[] = {3, 9, 6, 7};
int len = arr.length;
for(int i = 0; i < len; i++)
{
int num = arr[i];
arrList.add(num);
num = num * 2;

arrList.add(num);
}


len = arrList.size();
System.out.println("Size: " + len);
for(int i = 0; i < len; i++)
{
int ele = arrList.get(i);
System.out.println("#" + i + " : " + ele);
}

Traversing an ArrayList: Using Iterator