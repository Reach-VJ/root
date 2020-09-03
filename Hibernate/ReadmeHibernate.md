## **Hibernate Demo**

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
 
 <img src="images/one2one.png" width=50% height=50%>
 
 **Entity Lifecycle**
 
  <img src="images/entitylifecycle.png" width=50% height=50%>
  
  <img src="images/entitylifecycle2.png" width=50% height=50%>
  
  <img src="images/entitylifecycle.png" width=50% height=50%>
 
 
