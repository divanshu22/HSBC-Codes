## Day 1 Assignments


1) Identify the classes, attributes, methods and the relationships between the classes for the below use case. You can show the relationship by using class diagrams.
- Xyz Hospital wants to store the details of their rooms, patients and doctors. 
  - There are two types of patients In-patients and out-patients. Both the patients have some common properties like patient id, patient name, age, patient complaint. 
  - For in-patients, the application should store additional details like date of joining, room no and date of discharge. 
  - For out-patients, it should store additional details like date of visit, and doctor name. 
  - Application also maintains details of all the doctors like doctor id, name, age, specialization. 
  - Each room in the hospital is uniquely identified by room no, room name, capacity of the room and doctor in charge.

2) Write a method which accepts empno, name, age and country as parameters from the user and returns a string by adding all the details separated by “;”. Call this method from the main method and display the output. E.g. If the input is 12345, Naveen, 25 and India then method should return 12345;Naveen;25;India

3) Write a method that accepts 3 numbers as parameters and returns the sum of biggest and smallest numbers. E.g. if the input is 1 9 3, then method should return 10 (1+9) if the input is 2 9 2, then method should return 11(2+9). If the input is 9 9 9, then method should return 18(9+9)

4) Write a method which accepts a 3-digit number and prints the output as shown in the below example
<br> E.g. If the input is 951, then the program should print “(9 x 100) + (5 x 10) +1”

5) Write the below methods in a class and provide the appropriate implementations. 
``` public void add (int a, int b)
public void add (long a, long b)
public void add (float a, float b)
public void add (short a, short b)
```
Call all the methods by passing different parameters. Hint: to call method `add(short a, short b)` use `add((short)5,(short)6)`

6) Write necessary methods in a class based on the below rules 
  - Method call `add(10,20)` should return `30`
  - Method call `add(10,20,30)` should return `60`
  - Method call `add(10.5, 20.1)` should return `30.6`
  - Method call `add(“Hello”,20)` should return `Hello 20`

7) Write a class Product with the following attributes
  - productId of type integer
  - productName of type String
  - description of type String
  - price of type float
  - maxDiscountAllowed of type float (it is in percentage)
  - monthOfManufacture of type integer
  - yearOfManufacture of type integer
  - imported of type boolean (if true it means product is imported from other countries)
<br> Write all the setter/getter for all the attributes along with the below methods
  - getDiscountedPrice() it should return the price minus the discount amount
  - getTotalPriceForItems(int count) it should return the price multiplied by number of items.
  - getDiscountedPriceForItems(int count) it should return discounted price multiplied by number of items.
<br> Create another class TestMain with the main method to perform the below actions
  - Create three objects of the above Product class
  - Populate the attributes of objects by calling setter methods
  - Print the name of the Product with the highest price
  - Print the name and price of the Product with highest discounted percentage
  - For every Product, print the product name, price, and price after discount in a single line; If the value of the imported is true then print “Product is imported” otherwise print “Product is a local product”
