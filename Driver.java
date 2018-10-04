public class Driver{

  public static void main(String[] args) {
    BankAccount yeet = new BankAccount(1234.55,8001919,"yoted");

        System.out.println("Balance: $" + yeet.getBalance());
        System.out.println("Account ID: " + yeet.getAccountID());
        System.out.println(yeet);

        yeet.setPassword("whomstv");

        if(yeet.deposit(111.0)){
          System.out.println("Deposit Success! :) ");
        }else{
          System.out.println("Deposit Failure! :( ");
        }

        if(yeet.deposit(-111.0)){
          System.out.println("Deposit Success! :) ");
        }else{
          System.out.println("Deposit Failure! :( ");
        }

        if(yeet.withdraw(111.0)){
          System.out.println("Withdraw Success! :) ");
        }else{
          System.out.println("Withdraw Failure! :( ");
        }

        if(yeet.withdraw(-111.0)){
          System.out.println("Withdraw Success! :) ");
        }else{
          System.out.println("Withdraw Failure! :( ");
        }

        if(yeet.withdraw(11111.0)){
          System.out.println("Withdraw Success! :) ");
        }else{
          System.out.println("Withdraw Failure! :( ");
        }
        
        System.out.println("Balance: $" + yeet.getBalance());
      }
  }
}
