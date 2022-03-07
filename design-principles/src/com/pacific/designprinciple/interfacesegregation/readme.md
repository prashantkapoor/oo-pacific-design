### Interface Segregation Principle

* Classes should not be dependent on methods they don't use.

#### Cohesion
_How strong are the relationships between an interface's methods?_  Achieve highly cohesive classes

Less cohesion, methods are not related, few of the methods will be implemented
````
interface VendingMachine{
    takeMoney()
    brewHotChocolate()
    brewCoffee()
    brewTea()
    dispenseSnacks()
    dispenseWater()
    dispenseSnacks()
    dispenseSoda()
}
````

#### Highly Cohesive - Segregation
````
VendingMachine{
    takeMoney()
}
HotBeverageVendingMachine implements VendingMachine{
    brewHotChocolate()
    brewCoffee()
    brewTea()
}
ColdBeverageVendingMachine implements VendingMachine{
    dispenseSnacks()
    dispenseWater()
    dispenseSoda()
}
SnackVendingMachine implements VendingMachine{
    dispenseSnacks()
}

UberVendingMachine implements HotBeverageVendingMachine,ColdBeverageVendingMachine,SnackVendingMachine{
}
````