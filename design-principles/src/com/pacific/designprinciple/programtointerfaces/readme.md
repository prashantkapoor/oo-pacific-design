### Program to interfaces, Not implementations
* It means program to a supertype - **Java interface or abstract class**
* Intent is to apply polymorphism
* Free classes from knowledge of concrete types

````
class WebSystem{
CommercialDB db;
}
WebSystem webSystem=new WebSystem();
webSystem.db=new CommercialDB(); //Using concrete dependency of DB, restricts useage of any other db type
````

#### Correct Implementation - Programming in an Interface
````
class WebSystem{
    AbstractDB db; // abstract class or interface
}
class CommercialDB implements AbstractDB{
}
class TestDB implements AbstractDB{
}

WebSystem webSystem=new WebSystem();
webSystem.db=new CommercialDB();
    or
webSystem.db=new TestDB();

````

