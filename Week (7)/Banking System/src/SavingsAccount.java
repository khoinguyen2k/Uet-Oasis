public class SavingsAccount extends Account {

   public SavingsAccount(long accountNumber, double balance) {
      super(accountNumber, balance);
   }

   @Override
   public void withdraw(double amount) {
      try {
         if (amount > 1000) {
            throw new InvalidFundingAmountException(amount);
         } else if (balance < 5000) {
            throw new InsufficientFundsException(amount);
         } else {
            double init = balance;
            doWithdrawing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                  amount, init, balance);
            addTransaction(transaction);
         }
      } catch (BankException e) {
         System.out.println(e.getMessage());
      }
   }

   @Override
   public void deposit(double amount) {
      try {
         double init = balance;
         doDepositing(amount);
         Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
               amount, init, balance);
         addTransaction(transaction);
      } catch (BankException e) {
         System.out.println(e.getMessage());
      }
   }
}


