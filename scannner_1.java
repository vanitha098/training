import java.util.Scanner;
class Scanner_1
{
  public static void main(String args[])
{
     int num;
     float fnum;
     String str;
     
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter a string: ");
     str = sc.nextLine();
     System.out.println("Input String is: "+str);

     System.out.println("Enter an integer: ");
     num = sc.nextInt();
     System.out.println("Input Integer is: "+num);

     System.out.println("Enter a float number: ");
     fnum = sc.nextFloat();
     System.out.println("Input Float number is: "+fnum); 
}
}
