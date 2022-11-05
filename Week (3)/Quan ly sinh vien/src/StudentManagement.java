public class StudentManagement {
   Student[] students = new Student[100];
   int studentsNum = 0;

   /**
    * comment.
    */
   public static boolean sameGroup(Student s1, Student s2) {
      return (s1.getGroup().equals(s2.getGroup()));
   }

   /**
    * comment.
    */
   public void addStudent(Student newStudent) {
      for (int i = 0; i < studentsNum; i++) {
         if (students[i].getInfo().equals(newStudent.getInfo())) {
            return;
         }
      }

      students[studentsNum] = newStudent;
      studentsNum++;
   }

   /**
    * comment.
    */
   public String studentsByGroup() {
      String res = "";
      boolean[] checked = new boolean[studentsNum];
      for (int i = 1; i < studentsNum; i++) {
         checked[i] = false;
      }

      for (int i = 0; i < studentsNum; i++) {
         if (!checked[i]) {
            res += students[i].getGroup() + "\n";
            res += students[i].getInfo() + "\n";
            checked[i] = true;
            for (int j = i + 1; j < studentsNum; j++) {
               if (sameGroup(students[i], students[j])) {
                  res += students[j].getInfo() + "\n";
                  checked[j] = true;
               }
            }
         }
      }

      return res;
   }

   /**
    * comment.
    */
   public void removeStudent(String id) {
      int pos = -1;
      for (int i = 0; i < studentsNum; i++) {
         if (students[i].getId().equals(id)) {
            pos = i;
            break;
         }
      }
      if (pos == -1) {
         return;
      }

      System.arraycopy(students, pos + 1, students, pos, studentsNum - pos - 1);
      students[studentsNum - 1] = null;
      studentsNum--;
   }

}
