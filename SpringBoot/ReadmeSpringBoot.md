### SpringBoot Demo
**Pain points to build Mavan Spring Application**

 <img src="images/mavenpainpoints.png" width=50% height=50%>
 
* Course has many students.
* Student has many courses.
* Join table to maintain ManyToMany relation.
   
 <img src="images/manytomanyCourseStudents.png" width=50% height=50%>
   
 <img src="images/manytomanyStudentCourses.png" width=50% height=50%>

 **Primary Key** : Identify a unique row in a table.
 
**Foreign key** : Links tables together
              A field in one table that refers to primary key in another table.
              Referential integrity.
              Prevents the operations that would destroy relationship.
              Ensures only valid data inserted into foreign key column. 
              
 **Cascade** : Apply the same operation to related entities. If data update or delete in parent table
               should remove in the child too.
 
 **Data loading :**
 <p>    Eager : will retrieve everything.
 <p>    Lazy : will retrieve on request.
 
 **Relation ships**
 One to One --> Example Instructor --> Instructor details.
 ![Alt text](images/one2one.png?raw=true "Optional Title")
 
 **Entity Lifecycle**
 
  ![Alt text](images/entitylifecycle.png?raw=true "Optional Title")
  ![Alt text](images/entitylifecycle2.png?raw=true "Optional Title")
  
  [[images/entitylifecycle.png | width=100px | alt=Bridge]]
  
  <img src="/images/entitylifecycle.png" width=50% height=50%>
 
 
