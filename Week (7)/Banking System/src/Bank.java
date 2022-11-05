import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
   private List<Customer> customerList = new ArrayList<>();

   /**
    * comment.
    */
   public void readCustomerList(InputStream in) {
      List<String> data = new ArrayList<>();
      String line;
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      while (true) {
         try {
            if ((line = br.readLine()) == null) {
               break;
            }
         } catch (IOException e) {
            throw new RuntimeException();
         }
         data.add(line);
      }

      Customer customer = null;
      for (String row : data) {
         Account account = null;
         String[] arr = row.split(" ");

         if ('A' <= row.charAt(0) && row.charAt(0) <= 'Z') {
            String name = arr[0];
            for (int i = 1; i < arr.length - 1; i++) {
               name += " " + arr[i];
            }
            customer = new Customer(Long.parseLong(arr[arr.length - 1]), name);
            customerList.add(customer);

         } else if ('0' <= row.charAt(0) && row.charAt(0) <= '9') {
            if (arr[1].equals(Account.SAVINGS)) {
               account = new SavingsAccount(Long.parseLong(arr[0]), Double.parseDouble(arr[2]));
            } else if (arr[1].equals(Account.CHECKING)) {
               account = new CheckingAccount(Long.parseLong(arr[0]), Double.parseDouble(arr[2]));
            }

            if (customer != null) {
               customer.addAccount(account);
            }
         }

      }

   }

   /**
    * comment.
    */
   public String getCustomersInfoByNameOrder() {
      String ans = "";
      Collections.sort(customerList, new NameComparator());
      for (int i = 0; i < customerList.size(); i++) {
         ans += customerList.get(i).getCustomerInfo() + (i != customerList.size() - 1 ? "\n" : "");
      }
      return ans;
   }

   /**
    * comment.
    */
   public String getCustomersInfoByIdOrder() {
      String ans = "";
      Collections.sort(customerList, new IdComparator());
      for (int i = 0; i < customerList.size(); i++) {
         ans += customerList.get(i).getCustomerInfo() + (i != customerList.size() - 1 ? "\n" : "");
      }
      return ans;
   }

   public List<Customer> getCustomerList() {
      return customerList;
   }

   /**
    * comment.
    */
   public class IdComparator implements Comparator<Customer> {
      @Override
      public int compare(Customer c1, Customer c2) {
         if (c1.getIdNumber() < c2.getIdNumber()) {
            return -1;
         } else if (c1.getIdNumber() > c2.getIdNumber()) {
            return 1;
         } else {
            return 0;
         }
      }
   }

   /**
    * comment.
    */
   public class NameComparator implements Comparator<Customer> {
      @Override
      public int compare(Customer c1, Customer c2) {
         return c1.getFullName().compareTo(c2.getFullName());
      }
   }
}
