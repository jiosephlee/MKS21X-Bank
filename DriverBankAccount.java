public class DriverBankAccount{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
    BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");

    System.out.println("Account b1:");
    System.out.println(b1);
    System.out.println("Account b2:");
    System.out.println(b2);
    System.out.println();


    double cashAmount = 300.0;
    while(cashAmount < 3000){
      System.out.println("Attempt to move "+cashAmount+" from the b1 to b2 account:");
      if(b1.withdraw(cashAmount) ){
        if(b2.deposit(cashAmount)){
          System.out.println("Success");
        }else{
          //This should never happen.
          //Error message provided to make sure that is the case
          System.out.println(cashAmount + " withdrawn from" +
                             b1 + "Failed to add to "+b2);
        }
      }else{
        System.out.println("Failed to withdraw "+cashAmount+" from "+b1);
      }

      System.out.println("Account b1:");
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();
      cashAmount *= 2;
    }
  }
}

Notice how clunky this process is?
Assignment:
1. Take your bank account and test it with my driver.
2. Add the following methods:

/*This private method will allow internal methods to check the password easily*/
private boolean authenticate(String password)

/**Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
 *@param other which BankAccount to GIVE the money to
 *@param amount how much money to transfer, negative amounts will make this operation fail.
 *@param password to be checked against the source account, incorrect password will make this operation fail.
 *@return true if successful, false otherwise.
 */
public boolean transferTo(BankAccount other, double amount, String password)

