class Student{
int id;
float percentage;
static String clg;
}
class Employee
{
int employee_id;
int salary;
static String company_name;
}
class Variable2
{
public static void main(String[] args)
{
Student rahul=new Student();
rahul.id=1023;
rahul.percentage=76.5f;
Student.clg="TKR";
System.out.println("=============student Details================");
System.out.println("student Id "+rahul.id);
System.out.println("perentage="+rahul.percentage);
System.out.println("college="+Student.clg);
System.out.println("============Default Values=================");
Student shiva1=new Student();
System.out.println(shiva1.id);
System.out.println(shiva1.percentage);
System.out.println(Student.clg);
Employee shiva=new Employee();
shiva.employee_id=2021;
shiva.salary=24000;
Employee.company_name="JNIT";
System.out.println("==================Employee Details=============");
System.out.println("employee id="+shiva.employee_id);
System.out.println("Eemployee salary="+shiva.salary);
System.out.println(Employee.company_name);
}
}