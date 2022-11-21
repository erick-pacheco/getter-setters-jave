# Instructions  
### Description:
Encapsulation is the idea of defining where and how certain parts of the program can be accessed, which has many benefits, namely reducing human error, and in doing so, improving the security of the program.*<br><br>
In this lab, you will use the private keyword to create variables that are restricted to only be accessible within their class, and the public keyword to create getters and setters, methods used to access those private variables. 

\*As a note, encapsulation is not a security measure per se, but helps to prevent compromising other security measures

### Steps:
1. Copy and paste the following starter code in a new file called CreditCard.java:
```java
public class CreditCard{

  //Two private variables here
  //The private modifier means that the variables here can only be accessed within this class, external access will have to be done with non-private methods.
  private String name;
  private String creditCardNumber;

}
```
2. Add another private String called expirationDate, and a private int called cvv
3. Copy and paste the following code:
```java
  //This is a setter, and just as it's name would suggest, it sets the name variable.
  public void setName(String name){
    this.name = name;
  }

  //Also clearly named, here we get the name variable
  public String getName(){
    return name;
  }
  //note how both methods have the public modifier. This allows us to access the methods anywhere throughout the program. 
```
4. Create the remaining getters and setters in CreditCard.java
5. Back in Main.java, Create a new credit card object. Name it card.
6. Use ``card.setName("Annabeth Chase");`` to set the name to "Annabeth Chase"
7. Set the number to "3242542123112744"
8. Set the expiration date to "01/25"
9. set the CVV to `633`
10. Use ``System.out.println(card.getName());`` to get the cardholder's name and print it out.
11. Create one or more print statements that use getters to print the following output:
```
Your card details:
Cardholder Name: Annabeth Chase
Card Number: 3242542123112744
Expiration Date: 01/25
CVV: 633
```
### Test:
Use the test provided. Tests can be found in the checkmark on the bottom of the left-hand menu

#### Sample output:
```
Annabeth Chase
Your card details:
Cardholder Name: Annabeth Chase
Card Number: 3242542123112744
Expiration Date: 01/25
CVV: 633


  
  