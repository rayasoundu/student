import java.util.HashMap;
import java.util.Map;

class StudentCourses {
private Map&lt;String, Integer&gt; courses;

public StudentCourses() {
courses = new HashMap&lt;&gt;();
}

public void addCourse(String course, int marks) {
courses.put(course, marks);
}

public void displayCourses() {
System.out.println(&quot;Courses and Marks:&quot;);
for (Map.Entry&lt;String, Integer&gt; entry : courses.entrySet()) {
System.out.println(entry.getKey() + &quot;: &quot; + entry.getValue());
}
}

public static void main(String[] args) {
StudentCourses studentCourses = new StudentCourses();
studentCourses.addCourse(&quot;Mathematics&quot;, 85);
studentCourses.addCourse(&quot;Computer Science&quot;, 90);
studentCourses.addCourse(&quot;Physics&quot;, 78);
studentCourses.displayCourses();
}
}