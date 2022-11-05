public class Circle extends Shape {
   protected double radius;
   protected Point center;

   public Circle() {
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
   }

   /**
    * comment.
    */
   public Circle(Point center, double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
      this.center = center;
   }

   public Point getCenter() {
      return center;
   }

   public void setCenter(Point center) {
      this.center = center;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   @Override
   public double getArea() {
      return Math.PI * radius * radius;
   }

   @Override
   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }

   @Override
   public String toString() {
      return "Circle[center=" + center.toString() + ",radius=" + this.radius
            + ",color=" + this.color + ",filled=" + this.filled + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Circle) {
         Circle circle = (Circle) obj;
         return this.getCenter().equals(circle.getCenter())
               && Math.abs(this.getRadius() - circle.getRadius()) < 0.001;
      }
      return false;
   }

   @Override
   public int hashCode() {
      int result;
      long temp;
      temp = Double.doubleToLongBits(radius);
      result = (int) (temp ^ (temp >>> 32));
      result = 31 * result + (center != null ? center.hashCode() : 0);
      return result;
   }
}