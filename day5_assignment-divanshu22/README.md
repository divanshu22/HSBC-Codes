## Day 5 Assignments

1) Make the below modifications to the Pizza class defined earlier.
  - Add insertionDate field of type Date
  - Override hashCode and equals methods
  - Implement Comparable interface. While comparing two objects consider the pizza name field.

2) Create different implementation classes to Storage interface as mentioned below
  - PizzaListStoreImpl: Use ArrayList for storing the pizza objects
  - PizzaSortedStoreImpl: Use TreeSet for storing the Pizza objects
  - PizzaMapStoreImpl: Use HashMap for storing the Pizza objects as values and the pizza name as keys.

3) Modify getPizzaStore() as mentioned below. Method should accept an integer as a parameter a. PizzaStore getPizzaStore(int code) method
  - If code = 1 then return PizzaStoreImplobject 
  - If code = 2 then return PizzaListStoreImpl
  - If code = 3 then return PizzaSortedStoreImpl
  - For any other value return PizzaMapStoreImpl
