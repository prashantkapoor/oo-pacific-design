###Single Responsibility Principle

* Limit the responsibility of a class, to minify the probability of its change
* By responsibility, we mean functions in a class.

#### Multiple responsibility
````
class Modem{
    dial()
    hangup()
    //handle data
    send()
    receive()
}
Do these methods make sense together ?
````

#### Separating out responsibilities
* Apply SRP when the need is real, otherwise it creates complexity.