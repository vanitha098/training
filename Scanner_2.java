Import java.util.Scanner;

Class Scanner_2 {
  Public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(“Enter name in String, age in Integer and salary in Double:”);

    String name = sc.nextLine();

    Int age = sc.nextInt();

    Double salary = sc.nextDouble();
    
    System.out.println(“Name: “ + name);
    System.out.println(“Age: “ + age);
    System.out.println(“Salary: “ + salary);
}
}
