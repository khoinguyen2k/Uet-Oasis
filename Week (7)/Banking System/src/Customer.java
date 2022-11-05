import java.util.ArrayList;
import java.util.List;

public class Customer {
   private long idNumber;
   private String fullName;
   private List<Account> accountList = new ArrayList<>();

   public Customer() {
   }

   public Customer(long idNumber, String fullName) {
      this.idNumber = idNumber;
      this.fullName = fullName;
   }

   /**
    * comment.
    */
   public String getCustomerInfo() {
      return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
   }

   /**
    * comment.
    */
   public void addAccount(Account account) {
      accountList.add(account);
   }

   /**
    * comment.
    */
   public void removeAccount(Account account) {
      accountList.remove(account);
   }

   public long getIdNumber() {
      return idNumber;
   }

   public void setIdNumber(long idNumber) {
      this.idNumber = idNumber;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public List<Account> getAccountList() {
      return accountList;
   }

}
