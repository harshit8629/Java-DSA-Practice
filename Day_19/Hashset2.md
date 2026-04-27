# HashSet
Problem 5      Give output of following code.

1    String str = "abracadabra"
2
3    HashSet<Character> mySet = new HashSet<Character>();
4
5    for(int i = 0; i < str.length(); i++)
6    {
7       char ch = str.charAt(i);
8
9       if(mySet.contains(ch))
10      {
11             System.out.println("$ : " + ch);
12      }
13
14      mySet.add(ch);
15   }
16   System.out.println(mySet);



Key Points
HashSet is part of Java Collection Framework. Some of the key points about HashSet are:
 HashSet class implements Set interface. Set interface provides basic methods like add(), contains(),
   etc.
 HashSet do not allow any duplicates.
 HashSet do not guarantee iteration order with time. This means traversing a given HashSet may or
   may not give us the elements in the same order in which they were inserted.
 HashSet do not allow getting an element based on its index.
 Searching an element is very fast in HashSet.

 Problem 6        Complete the function given below. The function takes an integer array as input.
                  Print all the unique odd numbers in this array. Use a HashSet to solve this problem.


 public void uniqueOdds(int[] arr)
 {
    //print all the unique odd numbers in the input array
    //use HashSet to solve this problem
 }

                  Input                                                  Output
 Test Cases       uniqueOdds({7,8,2,5,7,3,9,3,4,2})                      [7,5,3,9]
                                                                         //only 7,5,3 and 9 are odd


 Problem 7        Complete the function given below. The function takes a String ArrayList as input.
                  It then replaces all the repeat occurrences of any String in this ArrayList with
 
                  "Hello" and print the modified version.

                  1) Traverse the ArrayList and keep adding elements in a HashSet
                  2) If the element is already present in HashSet then replace that element in
 Steps
                     ArrayList with "Hello"
                  3) Print the modified ArrayList


 public void replaceDup(ArrayList<String> arrList)
 {
    //replace all the repeat occurrences of
    //any String in input ArrayList with "hello"
    //Print the modified ArrayList
 }

                  Input                                                  Output
 Test Cases       replaceDup([mat,bad,cat,mad,cat,bat,mat])              [mat,bad,cat,hello,
                                                                         hello,bat,hello]



Problem 8     Complete the function given below. The function takes two integer arrays as
UniqueFromTwo input. It then prints all the unique elements in both the arrays.

                    1) Add all elements from first array to a HashSet
Steps               2) Add all elements from second array to a HashSet
                    3) Print the HashSet


public void uniqueFromTwo(int[] arr1, int[] arr2)
{
       //print all the unique elements from both the arrays
}

                    Input                                                 Output
Test Cases
                    uniqueFromTwo({2,1,3,2,5},{3,4,0,1,4})                [2,1,3,5,4,0]


Problem 9     Complete the function given below. The function takes two integer arrays as
              input. It then prints all the elements from second array that are present in thefirst (common elements). Assume there are no duplicates in each array.

                      1) Add all elements from first array to a HashSet
Steps                 2) Traverse the second array. And print all the elements which are present in
                         the Set.


public void commonFromTwo(int[] arr1, int[] arr2)
{
       //print all the common elements in input arrays
}

                      Input                                                Output
Test Cases
                      commonFromTwo({2,1,5,3},{3,4,0,1,10})                3, 1