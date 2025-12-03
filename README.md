# Online Food Ordering System – Backend Simulation
## Description
A backend simulation of an online food ordering system using
Composite, Command, Observer, and Facade design patterns.

## How To Run
1. Open project in any Java IDE (IntelliJ / NetBeans / Eclipse)
2. Run Main.java

## Dependencies
- Java 17 or above
- No external libraries required

## Folder Structure
(mention in project report)
OnlineFoodOrderingSystem/
│
└─ src/
   ├─ Main.java
   ├─ menu/
   │    ├─ MenuComponent.java
   │    ├─ MenuItem.java
   │    └─ MenuCategory.java
   │
   ├─ command/
   │    ├─ OrderCommand.java
   │    ├─ PlaceOrderCommand.java
   │    ├─ CancelOrderCommand.java
   │    └─ OrderInvoker.java
   │
   ├─ observer/
   │    ├─ Observer.java
   │    ├─ OrderSubject.java
   │    ├─ RestaurantObserver.java
   │    └─ DeliveryObserver.java
   │
   └─ facade/
        └─ FoodOrderingFacade.java


## Known Issues
- No real UI (console only)
- No real order database
