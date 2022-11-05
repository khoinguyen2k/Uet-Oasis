public class CheckingAccount extends Account {

   public CheckingAccount(long accountNumber, double balance) {
      super(accountNumber, balance);
   }

   @Override
   public void withdraw(double amount) {
      try {
         double init = balance;
         doWithdrawing(amount);
         Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
               amount, init, balance);
         addTransaction(transaction);
      } catch (BankException e) {
         System.out.println(e.getMessage());
      }
   }

   @Override
   public void deposit(double amount) {
      try {
         double init = balance;
         doDepositing(amount);
         Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
               amount, init, balance);
         addTransaction(transaction);
      } catch (BankException e) {
         System.out.println(e.getMessage());
      }
   }
}
