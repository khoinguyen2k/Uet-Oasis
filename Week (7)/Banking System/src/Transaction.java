public class Transaction {
   public static final int TYPE_DEPOSIT_CHECKING = 10;
   public static final int TYPE_WITHDRAW_CHECKING = -10;
   public static final int TYPE_DEPOSIT_SAVINGS = 1;
   public static final int TYPE_WITHDRAW_SAVINGS = -1;
   private int type;
   private double amount;
   private double initialBalance;
   private double finalBalance;

   /**
    * comment.
    */
   public Transaction(int type, double amount, double initialBalance, double finalBalance) {
      this.type = type;
      this.amount = amount;
      this.initialBalance = initialBalance;
      this.finalBalance = finalBalance;
   }

   /**
    * comment.
    */
   private String getTransactionTypeString(int type) {
      String ans = "";
      switch (type) {
         case TYPE_DEPOSIT_CHECKING:
            ans = "Nạp tiền vãng lai";
            break;
         case TYPE_WITHDRAW_CHECKING:
            ans = "Rút tiền vãng lai";
            break;
         case TYPE_DEPOSIT_SAVINGS:
            ans = "Nạp tiền tiết kiệm";
            break;
         case TYPE_WITHDRAW_SAVINGS:
            ans = "Rút tiền tiết kiệm";
            break;
         default:
            break;
      }
      return ans;
   }

   /**
    * comment.
    */
   public String getTransactionSummary() {
      String ans = "- Kiểu giao dịch: " + getTransactionTypeString(type)
            + ". Số dư ban đầu: $" + String.format("%.2f", initialBalance)
            + ". Số tiền: $" + String.format("%.2f", amount)
            + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".";
      return ans;
   }
}
