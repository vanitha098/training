class Student{
int id;
float percentage;
float height;
int weight;
String address;
static String college;
static String branch;
static String subject;
}
public class Variables{
public static void main(String args[]){
Student Vanitha= new Student();
Vanitha. id = 411;
Vanitha. percentage = 68.4f;
Vanitha. height = 4.9f;
Vanitha. weight =40;
Vanitha. address = "H. No:- 4-2-163,Vagu center Vijayawada";
Student.college = "SVECW";
Student.branch = "ECE";
Student.subject = "SS,Rvsp,emwtl";
System.out.println("Student id="+Vanitha.id);
System.out.println("Student percentage="+Vanitha.percentage);
System.out.println("Student height="+Vanitha.height);
System.out.println("Student weight="+Vanitha.weight);
System.out.println("Student address="+Vanitha.address);
System.out.println("College name="+Student.college);
System.out.println("Branch="+Student.branch);
System.out.println("Subjects="+Student.subject);
}
}
