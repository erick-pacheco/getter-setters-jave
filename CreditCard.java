public class CreditCard {
  
  private String name;
  private String creditCardNumber;
  private String expirationDate;
  private int cvv;
  

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setCreditCardNumber(String creditCardNumber){
    this.creditCardNumber = creditCardNumber;
  }

  public String getCreditCardNumber(){
    return creditCardNumber;
  }

  public void setExpirationDate(String expirationDate){
    this.expirationDate = expirationDate;
  }

  public String getExpirationDate(){
    return expirationDate;
  }

  public void setCvv(int cvv){
    this.cvv = cvv;
  }

  public int getCvv(){
    return cvv;
  }
}


