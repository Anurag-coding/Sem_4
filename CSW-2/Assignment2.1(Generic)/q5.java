class Student implements Comparable<Student>{
	String name;
	int rollNumber;
	int totalMark;
	public Student(String name, int rollNumber, int totalMark) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.totalMark = totalMark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	@Override
	public int compareTo(Student s) {
		if(this.rollNumber==s.rollNumber) {
			return 0;
		}else if(this.rollNumber>s.rollNumber){
			return 1;
		}else {
			return -1;
		}
	}
	public String toString() {
		return "\nName :"+getName()+"\nRoll Number : "+getRollNumber()+"\nTotal Marks : "+getTotalMark();
	}
}
public class q5 {
    public static void main(String[] args) {
		Student s1=new Student("Anurag",4,99);
		Student s2=new Student("Sohan",2,78);
		Student s3=new Student("Mohan",1,56);
		Student s[]={s1,s2,s3};
        for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].compareTo(s[j+1])==1) {
					int temp=s[j].getRollNumber();
					s[j].setRollNumber(s[j+1].getRollNumber());
					s[j+1].setRollNumber(temp);
				}
			}
		}
        for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
/* output:-
   Name :Anurag
   Roll Number : 1
   Total Marks : 99

   Name :Sohan
   Roll Number : 2
   Total Marks : 78

   Name :Mohan
   Roll Number : 4
   Total Marks : 56
*/