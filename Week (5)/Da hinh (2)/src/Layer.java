import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Layer {
   private List<Shape> shapes = new ArrayList<>();

   /**
    * comment.
    */
   public void addShape(Shape shape) {
      shapes.add(shape);
   }

   /**
    * comment.
    */
   public String getInfo() {
      String ans = "Layer of crazy shapes:\n";
      for (Shape shape : shapes) {
         ans += shape.toString() + "\n";
      }
      return ans;
   }

   /**
    * comment.
    */
   public void removeCircles() {
      for (int i = shapes.size() - 1; i >= 0; i--) {
         if (shapes.get(i) instanceof Circle) {
            shapes.remove(i);
         }
      }
   }

   /**
    * comment.
    */
   public void removeDuplicates() {
      Set<Shape> set = new LinkedHashSet<>(shapes);
      shapes = new ArrayList<>(set);
   }
}
