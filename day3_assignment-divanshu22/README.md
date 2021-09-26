## Day 3 Assignments

Note: All classes should be organized into packages that follow a well-defined hierarchy.

1) A Job tracker application is used for tracking the activities of a team. Each activity is represented as a Job class. Create a class Job with the attributes job name, owner, effort required (in months), month of creation, year of creation, status (not started/ work in progress/ completed). Write necessary methods to accept and display the information. Create the constructors based on the below rules.
  - Job name and owner are mandatory fields and should be supplied at the time of creating a class
  - Compiler should raise an error when we try to create Job object without passing any parameters.
  - Write a constructor which accepts all the attributes as parameters while creating the object. From this constructor call the constructor (mentioned at point a) to initialize the mandatory fields

2) In the above class create a static variable jobsCount. Write necessary methods to get its value. Every time an object of Job is created, increment the value of jobsCount variable by 1.

3) Create a jobId field. Make this variable as a readOnly (make it private and write only getter method). Generate jobId value by using the below formula
<br> jobId= "jobName" + "\_" + jobsCount
<br> E.g. if the Job name is “Maintain Server” and the value of jobsCount variable is 31, then store "Maintain Server_31" in jobId

4) Class PriorityJob contains all the attributes of Job class and other attributes to store the priority of the job (low, medium, high) and monitoredBy field to store the name of the person monitoring the Job. Another class MultiOwnerJob contains all attributes of Job class in addition to the name of the second owner.  
  - Write necessary classes, constructors and methods for storing and displaying additional information. Hint: use super keyword to call the methods/constructor of super class.

5) In the Job class write a method called showDetails() which returns a String by concatenating all the field values.

6) Override showDetails() method of Job (created in Day 3) in its the sub classes to include the details of additional fields. Use super key word to call the methods of super class if required.

7) Create an array of Job class and store Objects of Job, PriorityJob, and MultiOwnerJob in the array.

8) Using a single for loop try traverse the above array and call the method showDetails() on all the objects of the array. Understand the concept of runtime polymorphism.

9) Check whether it is possible to call all the methods of PriorityJob and MultiOwnerJob while traversing the array. If not use typecasting to achieve the above task.
