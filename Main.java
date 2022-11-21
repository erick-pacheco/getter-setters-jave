class Main {
  public static void main(String[] args) {
    CreditCard cc = new CreditCard();

    /* Set values as per tests */
    cc.setName("Annabeth Chase");
    cc.setCreditCardNumber("3242542123112744");
    cc.setCvv(633);
    cc.setExpirationDate("01/25");

    /* Log values as expected by tests */
    log(cc.getName());
    log("Your card details:");
    log("Cardholder Name: " + cc.getName());
    log("Card Number: " + cc.getCreditCardNumber());
    log("Expiration Date: " + cc.getExpirationDate());
    log("CVV: " + cc.getCvv());

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
