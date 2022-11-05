import java.util.ArrayList;
import java.util.List;

public abstract class Account {
   public static final String CHECKING = "CHECKING";
   public static final String SAVINGS = "SAVINGS";
   protected long accountNumber;
   protected double balance;
   protected List<Transaction> transactionList = new ArrayList<>();

   public Account() {
   }

   public Account(long accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
   }

   public long getAccountNumber() {
      return accountNumber;
   }

   public double getBalance() {
      return balance;
   }

   /**
    * comment.
    */
   public void doWithdrawing(double amount) throws BankException {
      if (amount > balance) {
         throw new InsufficientFundsException(amount);
      } else if (amount < 0) {
         throw new InvalidFundingAmountException(amount);
      } else {
         balance -= amount;
      }
   }

   /**
    * comment.
    */
   public void doDepositing(double amount) throws BankException {
      if (amount < 0) {
         throw new InvalidFundingAmountException(amount);
      } else {
         balance += amount;
      }
   }

   /**
    * comment.
    */
   public abstract void withdraw(double amount);

   public abstract void deposit(double amount);

   /**
    * comment.
    */
   public String getTransactionHistory() {
      String ans = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
      for (int i = 0; i < transactionList.size(); i++) {
         ans += transactionList.get(i).getTransactionSummary()
               + (i != transactionList.size() - 1 ? "\n" : "");
      }
      return ans;
   }

   /**
    * comment.
    */
   public void addTransaction(Transaction transaction) {
      transactionList.add(transaction);
   }

   /**
    * comment.
    */
   public boolean equals(Object object) {
      if (object instanceof Account) {
         Account account = (Account) object;
         return accountNumber == account.getAccountNumber();
      } else {
         return false;
      }
   }
}
