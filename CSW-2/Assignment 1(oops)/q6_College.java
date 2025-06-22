class College{
   private String collegeName;
   private String collegeLoc;
   public College(String collegeName,String collegeLoc){
        this.collegeName=collegeName;
        this.collegeLoc=collegeLoc;
   }
   String getCollegeName(){
        return collegeName;
   }
   String getCollegeLoc(){
        return collegeLoc;
   }
}
class Student{
    int studentId;
    String studentName;
    College college; 
    public Student(int studentId,String studentName,College college){
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    void displayStudentInfo(){
        System.out.println("\nStudent ID : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("College : "+college.getCollegeName()+"-"+college.getCollegeLoc());
    }
}
public class q6_College {
    public static void main(String[] args) {
        College c1=new College("Arka Jain","Jamshedpur");
        College c2=new College("ITER","Bhubaneshwar");
        Student s1=new Student(46,"Shayam",c1);
        Student s2=new Student(891,"Anurag",c2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
/* output:-
   Student ID : 46
   Student Name : Shayam
   College : Arka Jain-Jamshedpur

   Student ID : 891
   Student Name : Anurag
   College : ITER-Bhubaneshwar
*/
