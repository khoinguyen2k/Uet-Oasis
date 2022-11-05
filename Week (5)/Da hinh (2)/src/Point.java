public class Point {
   private double pointX;
   private double pointY;

   public Point(double pointX, double pointY) {
      this.pointX = pointX;
      this.pointY = pointY;
   }

   public double getPointX() {
      return pointX;
   }

   public void setPointX(double pointX) {
      this.pointX = pointX;
   }

   public double getPointY() {
      return pointY;
   }

   public void setPointY(double pointY) {
      this.pointY = pointY;
   }

   /**
    * commnet.
    */
   public double distance(Point p) {
      return Math.sqrt((this.getPointX() - p.getPointX()) * (this.getPointX() - p.getPointX())
            + (this.getPointY() - p.getPointY()) * (this.getPointY() - p.getPointY()));
   }

   @Override
   public String toString() {
      return "(" + pointX + "," + pointY + ")";
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Point) {
         Point point = (Point) obj;
         return Math.abs(this.getPointX() - point.getPointX()) < 0.001
               && Math.abs(this.getPointY() - point.getPointY()) < 0.001;
      }
      return false;
   }

   @Override
   public int hashCode() {
      int result;
      long temp;
      temp = Double.doubleToLongBits(pointX);
      result = (int) (temp ^ (temp >>> 32));
      temp = Double.doubleToLongBits(pointY);
      result = 31 * result + (int) (temp ^ (temp >>> 32));
      return result;
   }
}
