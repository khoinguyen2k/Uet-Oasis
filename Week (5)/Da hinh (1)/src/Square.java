public class Square extends Rectangle {

   public Square() {
   }

   /**
    * comment.
    */
   public Square(double side) {
      this.width = side;
      this.length = side;
   }

   /**
    * comment.
    */
   public Square(double side, String color, boolean filled) {
      this(side);
      this.color = color;
      this.filled = filled;
   }

   /**
    * comment.
    */
   public double getSide() {
      return width;
   }

   /**
    * comment.
    */
   public void setSide(double side) {
      this.width = side;
      this.length = side;
   }

   @Override
   public void setWidth(double width) {
      this.width = width;
      this.length = width;
   }

   @Override
   public void setLength(double length) {
      this.width = length;
      this.length = length;
   }

   @Override
   public String toString() {
      return "Square[side=" + this.width
            + ",color=" + this.color + ",filled=" + this.filled + "]";
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}