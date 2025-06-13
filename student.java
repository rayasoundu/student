import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
private String name;
private Date dob;
private int age;

public Student(String name, String dob) throws ParseException {
this.name = name;
this.dob = new SimpleDateFormat(&quot;dd-MM-yyyy&quot;).parse(dob);
this.age = calculateAge();
}

private int calculateAge() {

Date today = new Date();
long ageInMillis = today.getTime() - dob.getTime();
return (int) (ageInMillis / (1000L * 60 * 60 * 24 * 365));
}

public void displayStudentDetails() {
System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;Date of Birth: &quot; + new SimpleDateFormat(&quot;dd-MM-
yyyy&quot;).format(dob));
System.out.println(&quot;Age: &quot; + age);
}

public static void main(String[] args) throws ParseException {
Student student = new Student(&quot;Alice&quot;, &quot;15-08-2002&quot;);
student.displayStudentDetails();
}
}