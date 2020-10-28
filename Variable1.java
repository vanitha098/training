class Customer{
int id;
String name;
String gender;
String marital_status;
String address;
int postal_code;
String contact_number;
String city;
String country;
}
class Variable1{
public static void main(String args[]){
Customer c=new Customer();
c.id=0305;
c.name="vanitha";
c.contact_number="7569075673";
c.gender="female";
c.marital_status="single";
c.address="vagucenter";
c.postal_code=520001;
c.city="vijayawada";
c.country="india";
System.out.println("Customer id="+c.id);
System.out.println("name="+c.name);
System.out.println("gender="+c.gender);
System.out.println("marital_status="+c.marital_status);
System.out.println("address="+c.address);
System.out.println("postal_code="+c.postal_code);
System.out.println("contact_number="+c.contact_number);
System.out.println("city="+c.city);
System.out.println("country="+c.country);
}
}

