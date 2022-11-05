public class Student {
   private String name;
   private String id;
   private String group;
   private String email;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getGroup() {
      return group;
   }

   public void setGroup(String group) {
      this.group = group;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   /**
    * comment.
    */
   public Student() {
      this.name = "Student";
      this.id = "000";
      this.group = "K62CB";
      this.email = "uet@vnu.edu.vn";
   }

   /**
    * comment.
    */
   public Student(String name, String id, String email) {
      this.name = name;
      this.id = id;
      this.group = "K62CB";
      this.email = email;
   }

   /**
    * comment.
    */
   public Student(Student s) {
      this.name = s.getName();
      this.id = s.getId();
      this.group = s.getGroup();
      this.email = s.getEmail();
   }

   /**
    * comment.
    */
   public String getInfo() {
      String res = name + " - " + id + " - " + group + " - " + email;
      return res;
   }

}
