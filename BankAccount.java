/*Sole constructor requires all field's values*/
public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount( int newaccountID, double newbalance, String newpassword){
   balance = newbalance;
   accountID = newaccountID;
   password = newpassword;
 }

/*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
  public String toString(){
    return accountID + "\t" + balance;
  }

  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount > 0){
      balance += amount;
      return true;}
    return false;
  }

  public boolean withdraw(double amount){
    if (balance - amount > 0){
      balance -= amount;
      return true;
    }
    return false;
  }
}
