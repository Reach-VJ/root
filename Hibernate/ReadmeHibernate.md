## **Hibernate Demo**

 **Primary Key** : Identify a unique row in a table.
 
**Foreign key** : 
Links tables together
* A field in one table that refers to primary key in another table
* Referential integrity.
* Prevents the operations that would destroy relationship.
* Ensures only valid data inserted into foreign key column. 
              
 **Cascade** : Apply the same operation to related entities. If data update or delete in parent table
               should reflect in the child too.
 
 **Data loading :**
 <p>    Eager : will retrieve everything.
 <p>    Lazy : will retrieve on request.
  
**Insert data**

 <img src="images/insertdata.png" width=50% height=50%>
  
**Delete data**

 <img src="images/deletedatafromdb.png" width=50% height=50%>
 
 **Relation ships**
 
 One to One --> Example Instructor --> Instructor details.
 
 <img src="images/one2one.png" width=50% height=50%>
 
 **Entity Lifecycle**
 
  <img src="images/entitylifecycle.png" width=50% height=50%>
  
  <img src="images/entitylifecycle2.png" width=50% height=50%>
  
  **One to One Cascade Types**
  
  <img src="images/one2onecascadetype.png" width=50% height=50%>
  
  **One to One relation in tables in java code**
  
  <img src="images/one2onerelation.png" width=50% height=50%>
  
  **One to One bi direction relation to get parent object**
  
  <img src="images/bidirectional.png" width=50% height=50%>
  
   **One to One bi direction delete child and parent object**
  
  <img src="images/bidirectiondelete.png" width=50% height=50%>
  
  **One to One bi direction delete child only**
  
  <img src="images/bidirectionchildonlydelete1.png" width=50% height=50%>
  
  <img src="images/bidirectionchildonlydelete2.png" width=50% height=50%>

  **One to Many bi direction relationship**
  
  Instrucor teaches multiple courses. 
  Should not delete course if there is any change instructor.
  Should not delete instructor if there is any change in course.
  
  <img src="images/one2manycourse.png" width=50% height=50%>
  
  <img src="images/one2manyinstructor.png" width=50% height=50%>
  
   **Default Fetch Type**
   
   <img src="images/defaultfetchtype.png" width=50% height=50%>
   
   **Lazy loading annotaion**
   
   * Lazy loading of courses in instructor entity.
   
   <img src="images/lazyloading.png" width=50% height=50%>
   
   **Eager loading annotaion**
   
   * Eager loading of courses in instructor entity.
   
   <img src="images/eagerloading.png" width=50% height=50%>
   
   **Retrieve Lazy data techninques**
   
   <img src="images/lazyloadingtechniques.png" width=50% height=50%>
   
   **Retrieve Lazy data by HQL FETCH query**
   
   <img src="images/hqljointofetchdata.png" width=50% height=50%>
   
   **Many to Many relation ER Daigram**
   
   <img src="images/manytomanyrelation.png" width=50% height=50%>
  
   **Many to Many relation Annotaion details**
   
   * Course has many students.
   * Student has many courses.
   * Join table to maintain ManyToMany relation.
   
   <img src="images/manytomanyCourseStudents.png" width=50% height=50%>
   
   <img src="images/manytomanyStudentCourses.png" width=50% height=50%>

  


 
 
