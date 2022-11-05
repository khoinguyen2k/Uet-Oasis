import java.util.ArrayList;
import java.util.List;

public class Week11 {

   /**
    * comment.
    */
   public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
      List<T> ans = new ArrayList<>();
      for (T t : arr) {
         ans.add(t);
      }

      for (int i = 0; i < ans.size() - 1; i++) {
         for (int j = i + 1; j < ans.size(); j++) {
            if (ans.get(i).compareTo(ans.get(j)) > 0) {
               T tmp = ans.get(i);
               ans.set(i, ans.get(j));
               ans.set(j, tmp);
            }
         }
      }
      return ans;
   }
}
