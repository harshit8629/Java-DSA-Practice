# Traversing a HashSet: Using Iterator

We already know how to use an Iterator with ArrayList. HashSet and HashMap both support iterator.
This gives us fine control over traversing HashSet and HashMap elements.
Example 1: HashSet traversal : Iterator based approach
							
//Assume HashSet : numbers<Integer> contains [12, 1, 2]
Iterator<Integer> itr = numbers.iterator();
while(itr.hasNext())
  {
   int n = itr.next(); 
   System.out.println(n);
  }

//getting HashSet iterator

//checking if we are at end
//getting next element & moving forward

Output:
12
1
2

Explanation:
The iterator() method returns the object of Iterator class which points at the start of our HashSet. The
hasNext() method returns true if there is next element in the iteration. The next() method, moving
forward, gives us the next element.
Problem 1: Give output of following code.

//Assume HashSet : numbers<Integer> contains [2, 1, 4, 5]
ArrayList<Integer> arr = new ArrayList<Integer>();
Iterator<Integer> itr = numbers.iterator();
while(itr.hasNext())
 {
   int z = itr.next();
   if(z%2 == 0)
     {
       arr.add(z);
     }
   else
     {
       arr.add(z+1);
       arr.add(z+2);
     }
}

System.out.println(arr);



Traversing a HashMap: Using Iterator
-------------------------------------
Example 2: HashMap traversal : Iterator based approach

// Assume HashMap : dataMap<Integer, String> contains
// => {12="twelve", 10="ten", 99 ="ninety nine"}

Set<Integer> keys = dataMap.keySet();
Iterator<Integer> itr = keys.iterator();

//getting set of all keys
//getting iterator for keys

while(itr.hasNext())
 {
   int key = itr.next();
   String value = dataMap.get(key);
   System.out.println(value);
  }

//checking if we are at end
//getting the next key in iteration
//getting value for each key

Output:
twelve
ten
ninety nine

Explanation:
HashMap object doesn't directly support iterator object. Instead we first extract a Set of all keys present
in HashMap using keySet() method. We then iterate on this Set and extract value associated with each
key from our HashMap.


Problem 2: Give output of following code.

//Assume HashMap : m<Integer, Integer> contains [2=2, 3=4, 5=1, 7=8]
Set x = m.keySet();
Iterator<Integer> z = x.iterator();
while(z.hasNext())
 {
   int y = z.next();
   y = y * m.get(y);
   System.out.println(y);
 }

Problem 3: Complete the function given below. The function takes a HashMap representing
count of students enrolled in each subject. Print subject names with total enrolled
students greater than 50.

public void countEnrolled(HashMap<String, Integer> enrollments)
{
	//print subjects with total students greater than 50.
}

Input: countEnrolled(["Science"=55, "Arts"=10,
"Maths"=60])

Output:
Science
Maths

Problem 4: Given a HashSet containing names of students as input. Return an ArrayList of all
names with length greater than 3.

public ArrayList<Strings> extractNum(HashSet<String> names)
{
//return ArrayList of all names with length greater than 3.
}


Input: ListNames("Rohan", "Ann", "Tripp", "Eli")

Return Value
{"Rohan, "Tripp"}
