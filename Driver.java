public class Driver{

  public static void main(String[] args) {
    BankAccount yeet = new BankAccount(8001919, 1234.55, "yoted");

        System.out.println("Balance: $" + yeet.getBalance());
        System.out.println("Account ID: " + yeet.getAccountID());
        System.out.println("Account ID, Balance" + "   " + yeet);
        System.out.println("\n");

        yeet.setPassword("whomstv");

        if(yeet.deposit(111.0)){
          System.out.println("$" + 111.0 + " Deposit Success! :) ");
        }else{
          System.out.println("$" + 111.0 + " Deposit Failure! :( ");}
        System.out.println("Balance: $" + yeet.getBalance());

        if(yeet.deposit(-111.0)){
          System.out.println("$" + -111.0 + " Deposit Success! :) ");
        }else{
          System.out.println("$" + -111.0 + " Deposit Failure! :( ");}
        System.out.println("Balance: $" + yeet.getBalance());

        if(yeet.withdraw(111.0)){
          System.out.println("$" + 111.0 + " Withdraw Success! :) ");
        }else{
          System.out.println("$" + 111.0 + " Withdraw Failure! :( ");}
        System.out.println("Balance: $" + yeet.getBalance());

        if(yeet.withdraw(-111.0)){
          System.out.println("$" + -111.0 + " Withdraw Success! :) ");
        }else{
          System.out.println("$" + -111.0 + " Withdraw Failure! :( ");}
          System.out.println("Balance: $" + yeet.getBalance());

        if(yeet.withdraw(11111.0)){
          System.out.println("$" + 11111.0 + " Withdraw Success! :) ");
        }else{
          System.out.println("$" + 11111.0 + " Withdraw Failure! :( ");}
          System.out.println("Balance: $" + yeet.getBalance());
    }
}
