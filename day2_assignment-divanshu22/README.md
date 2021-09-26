## Day2 Assignments

Note: For the following assignments create an exclusive class called Tester which contains the main method. Create objects of other classes, make calls to the methods, and test your code using this Class’s main method.

1) Write a method that accepts two integers - n1 & n2 and prints the sum of all the factors for each integer between n1 and n2. E.g. For n1=4 and n2=6,
- Factors for 4 are 1, 2 & 4. Sum of factors is 1+2+4 =7 
- Factors for 5 are 1&5. Sum of factors is 1+5=6
- Factors for 6 are 1, 2, 3 & 6. Sum of factors is 1+2+3+6=12 
<br> Output: 7, 6, 12

2) Write a method which accepts a number n as a parameter and prints n0 to n10 as shown below using for loop, while loop and do while loop. Hint: Use Math.pow(x,y) method which returns xy in Java.
<br> E.g. For parameter 2, it should print 
<br> 2 power 0 = 1
<br> 2 power 1 = 2
<br> ...
<br> 2 power 10 = 1024

3) Write a method that accepts a 5-digit number N and returns the Category Code of the number. The category code is generated as follows
- Step 1: Convert the number to a single digit number by adding all the numbers
- Step 2: if the result is not a single digit number repeat step 1
- Step 3: assign the code based on the below rules
  - For number 1 to 5 --> Category code is “First”
  - For number 6 or 9 --> Category code is “Second”
<br> E.g. For input 12345
- Step 1: 1+2+3+4+5 =15
- Since 15 is a two-digit number repeat step 1; 1+5=6
- As per step 3, Category code is “Second”

4) Write a method which accepts a string as a parameter and returns the number of words in the String.

5) Write a program to test the below methods of String class 
  a. charAt
  b. contains
  c. length 
  d. indexOf 
  e. equals
  f. equalsIgnoreCase 
  g. join
  h. lastIndexOf
  i. substring
  j. tolowercase 
  k. touppercase 
  l. trim

6) Write a class ArrayStore which contains one instance variable of type integer array. Write the necessary methods for the following operations.
  a. Accept 10 numbers and store these numbers into the array.
  b. Displays all the numbers using while & for loops
  c. Sort the array
  d. Accepts a number and returns the number of occurrences of the accepted number in the array
  e. Insert a number at a specific position
  f. Return an array by removing duplicates. E.g. if the elements of the array are \[9,2,2,9,10,9\] then method should return \[9,2,10\]

7) Write a method which accepts a two-dimensional array and returns the sum of all the numbers in the diagonal
<br> E.g. Method should return 15 (1+5+9) for the below array 
<br> \[1 2 3
<br> 4 5 6 
<br> 7 8 9 \]

8) Write a method which accepts array of size 10. The method should convert it into a variable sized two-dimensional integer array as illustrated in the example and return it.
E.g. Consider the input array containing \[1, 3, 2, 4, 5,9,8,6,7,10\], Return the array of below numbers. 
<br> 1
<br> 3 2 
<br> 4 5 9
<br> 8 6 7 10
