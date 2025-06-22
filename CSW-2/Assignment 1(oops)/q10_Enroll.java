import java.util.ArrayList;
class Student{
    private String name;
    private int studentId;
    Student(String name,int studentId){
        this.name=name;
        this.studentId=studentId;

    }
    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudent(){
        return "Student Name : "+name+" , Student Id : "+studentId;
    }
}
class Course{
    private String courseName;
    private int courseCode;
    
    public Course(String courseName,int courseCode){
        this.courseName=courseName;
        this.courseCode=courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCourseCode(){
        return courseCode;
    }
    public String getCourse(){
        return courseName+" , Course Code : "+courseCode;
    }
}
interface EnrollmentSystem{
     void enroll(Student s,Course c);
     void drop(Student s,Course c);
     void displayDetails();
}
class Enrollment implements EnrollmentSystem{
    ArrayList<Student> studentList=new ArrayList<>();
    ArrayList<Course> courseList=new ArrayList<>();

    public void enroll(Student s,Course c){
        studentList.add(s);
        courseList.add(c);
        System.out.println(s.getStudent() +"\nEnrolled in "+c.getCourse());
    }
    @Override
public void drop(Student student, Course course) {
    int index = studentList.indexOf(student); // Find student's index
    if (index != -1 && courseList.get(index).equals(course)) { // Check if enrolled
        studentList.remove(index);
        courseList.remove(index);
        System.out.println(student.getName() + " dropped " + course.getCourse());
    } else {
        System.out.println(student.getName() + " is not enrolled in " + course.getCourse());
    }
}
    public void displayDetails(){
        System.out.println("Details of Student : ");
        for(Student stud:studentList){
            System.out.print(stud.getStudent());
            for(Course c:courseList){
                System.out.println(c.getCourse());
            }
        }
}
}

public class q10_Enroll {
    public static void main(String[] args) {
        Student s1=new Student("Anurag", 432);
        Course c1=new Course("Btech", 232);
        Student s2=new Student("Shatyam", 511);
        Course c2=new Course("BBA", 444);
        Student s3=new Student("Ankit", 1893);
        Course c3=new Course("Btech", 232);

        EnrollmentSystem e1=new Enrollment();
        e1.enroll(s1, c1);
        e1.enroll(s2, c2);
        e1.enroll(s3, c3);
        e1.displayDetails();
        e1.drop(s2, c2);
        e1.displayDetails();
    }
}
/* output:-
   Student Name : Anurag , Student Id : 432
   Enrolled in Btech , Course Code : 232
   Student Name : Shatyam , Student Id : 511
   Enrolled in BBA , Course Code : 444
   Student Name : Ankit , Student Id : 1893
   Enrolled in Btech , Course Code : 232
   Details of Student : 
   Student Name : Anurag , Student Id : 432Btech , Course Code : 232
   BBA , Course Code : 444
   Btech , Course Code : 232
   Student Name : Shatyam , Student Id : 511Btech , Course Code : 232
   BBA , Course Code : 444
   Btech , Course Code : 232
   Student Name : Ankit , Student Id : 1893Btech , Course Code : 232
   BBA , Course Code : 444
   Btech , Course Code : 232
   Shatyam dropped BBA , Course Code : 444
   Details of Student : 
   Student Name : Anurag , Student Id : 432Btech , Course Code : 232
   Btech , Course Code : 232
   Student Name : Ankit , Student Id : 1893Btech , Course Code : 232
   Btech , Course Code : 232
*/