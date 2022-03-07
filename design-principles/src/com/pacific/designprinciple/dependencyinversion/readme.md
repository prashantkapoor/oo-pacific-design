### Dependency Inversion Principle
* High-level modules should not depend on low-level modules.
* Abstraction should not depend on details but instead, details should depend on abstraction.
* All relationships between components should involve abstract classes or interfaces.
* Abstractions allow details of components to remain isolated from each other.

_Below High level component RemoteControl depends upon implementation of low level Television to perform an operation_
````
class RemoteControl{
    Television tv;
    click()
}
class Television{
    turnTVOn()
    turnTVOff()
}
````
_Abstraction underlies the application. Remote Control can control any device using its click button_
````
Remote Control depends on an abstraction
class RemoteControl{
    OnOffDevice device;
    click();
}
interface OnOffDevice{
    turnOn()
    turnOff()
} 
Television is depending on abstract class OnOffDevice
class Television implements OnOffDevice{
    turnOn(){
        turnTVOn();
    }
    turnOff(){
        turnTVOff();
    }
}
````