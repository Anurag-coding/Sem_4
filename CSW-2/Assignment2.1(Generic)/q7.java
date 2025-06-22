import java.util.Arrays;
import java.util.Comparator;
class Student {
    String name;
    int rollNo;
    int age;
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +"name='" + name + '\'' +", rollNo=" + rollNo +", age=" + age +'}';
    }
}
public class q7 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Rakesh", 3, 20),
            new Student("Sanjay", 1, 22),
            new Student("Sohan", 2, 19),
  
        };
        Arrays.sort(students, new Comparator<Student3>() {
            @Override
            public int compare(Student3 s1, Student3 s2) {
                return Integer.compare(s1.rollNo, s2.rollNo);
            }
        });
        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
        System.out.println("Sorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
/* output:-
   Sorted by Roll Number:
   Student{name='Sanjay', rollNo=1, age=22}
   Student{name='Sohan', rollNo=2, age=19}
   Student{name='Rakesh', rollNo=3, age=20}

   Sorted by Age:
   Student{name='Sohan', rollNo=2, age=19}
   Student{name='Rakesh', rollNo=3, age=20}
   Student{name='Sanjay', rollNo=1, age=22}
*/