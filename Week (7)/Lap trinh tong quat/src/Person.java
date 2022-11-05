public class Person implements Comparable<Person> {
   private String name;
   private int age;
   private String address;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   /**
    * comment.
    */
   public int compareTo(Person other) {
      if (name.compareTo(other.getName()) > 0) {
         return 1;
      } else if (name.compareTo(other.getName()) < 0) {
         return -1;
      } else {
         if (age < other.getAge()) {
            return -1;
         } else if (age > other.getAge()) {
            return 1;
         } else {
            return 0;
         }
      }
   }

}
