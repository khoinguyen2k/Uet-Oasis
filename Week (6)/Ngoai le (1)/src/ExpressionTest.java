public class ExpressionTest {
   /**
    * comment.
    */
   public static void main(String[] args) {
      try {
         Expression e = new Division(new Numeral(12), new Numeral(0));
         System.out.println(e.evaluate());
      } catch (ArithmeticException ex) {
         System.out.println(ex.getMessage());
      }
   }
}