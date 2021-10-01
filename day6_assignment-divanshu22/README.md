## Day 6 Assignments

1) Write SQL instructions for the below actions
  - Create a table Person (person id, person name, location, date of birth). Person id is a primary key
  - Create a table Person_Learnings (record id, name of course, duration, date of completion, person id). Record id is a primary key and person id is foreign key.
  - Insert, update and delete the rows in the above table.
  - Write SQL queries to: 
    - List all persons
    - List all persons who are located in “India” or “China” 
    - List all persons whose name starts with ‘A’
    - List the person id, person name, course name and date of completion of people who have learning records
    - List all names of persons who had completed “Cloud” course
    
2) Create a class PersonStore and write all the necessary methods for below operations on the database.
  - public void addProduct(Person p) throws PersonAlreadyExistsException (Raise this exception if the data base throws Record already exists exception)
  - public void updatePerson(Person p) 
  - public List<Person> getAllPersons()
  - public List<Person> getPersonsByCity(String location) 
  - public void addTwoPersons (Person p1, Person p2) throws PersonsNotAddedException (Raise this exception even if we are not able to add any one Person. Use transactions for this operation)
