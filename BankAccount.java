/*Sole constructor requires all field's values*/
public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double newbalance, int newaccountID, String newpassword){
   balance = newbalance;
   accountID = newaccountID;
   password = newpassword;
 }

/*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
  public String toString(){
    return balance + "\t" + accountID;
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
    if (balance - amount > 0 && amount >= 0){
      balance -= amount;
      return true;
    }
    return false;
  }

  private boolean authenticate(String password){
    return this.password == password;
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (this.authenticate(password) && this.withdraw(amount)){
      this.withdraw(amount);
      other.deposit(amount);
	    return true;}
    return false;
  }
}
