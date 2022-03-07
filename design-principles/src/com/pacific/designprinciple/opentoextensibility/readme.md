### Open/Closed Principle
* Open for **extensibility** but closed for **modification**
* Allows new behavior without risking changes to proven code.
* Improve maintainability and extensibility of a design.

````
class Duck{
    public void fly(){
        //To add any behavior of flying in a duck , we 
        //need to open this class and change the method.
        //and to support different categories of duck
    }
}
````

##### Consider Duck to be composed of flyingBehaviors
````
interface FlyBehavior{
    fly();
}
class FlyWithWings implements FlyBehavior{
    fly(){
    }
}
class CannotFly implements FlyBehavior{
    fly(){
    }
}
````
Any new fly behavior can be added without modifying any existing code
````
class Duck{
    FlyBehavior flyBehavior
    
    fly(){
        flyBehavior.fly();
    }
}
````