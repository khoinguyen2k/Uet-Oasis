public class Circle extends Shape {
   protected double radius;

   public Circle() {
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
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
      return "Circle[radius=" + this.radius
            + ",color=" + this.color + ",filled=" + this.filled + "]";
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}