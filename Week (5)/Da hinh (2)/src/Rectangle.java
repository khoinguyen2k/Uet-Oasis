public class Rectangle extends Shape {
   protected double width;
   protected double length;
   protected Point topLeft;

   public Rectangle() {
   }

   public Rectangle(double width, double length) {
      this.width = width;
      this.length = length;
   }

   /**
    * comment.
    */
   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
   }

   /**
    * comment.
    */
   public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
      this.topLeft = topLeft;
   }

   public Point getTopLeft() {
      return topLeft;
   }

   public void setTopLeft(Point topLeft) {
      this.topLeft = topLeft;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   @Override
   public double getArea() {
      return width * length;
   }

   @Override
   public double getPerimeter() {
      return 2 * (width + length);
   }

   @Override
   public String toString() {
      return "Rectangle[topLeft=" + topLeft.toString() + ",width="
            + this.width + ",length=" + this.length
            + ",color=" + this.color + ",filled=" + this.filled + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Rectangle) {
         Rectangle rectangle = (Rectangle) obj;
         return this.getTopLeft().equals(rectangle.getTopLeft())
               && Math.abs(this.getLength() - rectangle.getLength()) < 0.001
               && Math.abs(this.getWidth() - rectangle.getWidth()) < 0.001;
      }
      return false;
   }

   @Override
   public int hashCode() {
      int result;
      long temp;
      temp = Double.doubleToLongBits(width);
      result = (int) (temp ^ (temp >>> 32));
      temp = Double.doubleToLongBits(length);
      result = 31 * result + (int) (temp ^ (temp >>> 32));
      result = 31 * result + (topLeft != null ? topLeft.hashCode() : 0);
      return result;
   }
}