import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
   /**
    * comment.
    */
   public static void nullPointerEx() {
      Scanner scanner = null;
      scanner.next();
   }

   /**
    * comment.
    */
   public static String nullPointerExTest() {
      String msg = "Không có lỗi";
      try {
         nullPointerEx();
      } catch (NullPointerException e) {
         msg = "Lỗi Null Pointer";
      }
      return msg;
   }

   /**
    * comment.
    */
   public static void arrayIndexOutOfBoundsEx() {
      int[] arr = {1};
      int n = arr[1];
   }

   /**
    * comment.
    */
   public static String arrayIndexOutOfBoundsExTest() {
      String msg = "Không có lỗi";
      try {
         arrayIndexOutOfBoundsEx();
      } catch (ArrayIndexOutOfBoundsException e) {
         msg = "Lỗi Array Index Out of Bounds";
      }
      return msg;
   }

   /**
    * comment.
    */
   public static void arithmeticEx() {
      int n = 2 / 0;
   }

   /**
    * comment.
    */
   public static String arithmeticExTest() {
      String msg = "Không có lỗi";
      try {
         arithmeticEx();
      } catch (ArithmeticException e) {
         msg = "Lỗi Arithmetic";
      }
      return msg;
   }

   /**
    * comment.
    */
   public static void fileNotFoundEx() throws FileNotFoundException {
      String path = "asd";
      FileReader file = new FileReader(new File(path));
   }

   /**
    * comment.
    */
   public static String fileNotFoundExTest() {
      String msg = "Không có lỗi";
      try {
         fileNotFoundEx();
      } catch (FileNotFoundException e) {
         msg = "Lỗi File Not Found";
      }
      return msg;
   }

   /**
    * comment.
    */
   public static void ioEx() throws IOException {
      FileReader fileReader = new FileReader(new File("asd"));
      int n = fileReader.read();
   }

   /**
    * comment.
    */
   public static String ioExTest() {
      String msg = "Không có lỗi";
      try {
         ioEx();
      } catch (IOException e) {
         msg = "Lỗi IO";
      }
      return msg;
   }
}
