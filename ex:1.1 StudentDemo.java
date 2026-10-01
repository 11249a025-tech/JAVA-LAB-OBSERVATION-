class Student {
int roll;
String name;
int marks;
void set(int r, String n, int m) {
roll = r; name = n; marks = m;
}
void show() {
System.out.println(roll + " " + name + " " + marks);
}
}
public class StudentDemo {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
s1.set(101, "jyooooo", 91);
s2.set(102, "dhathuuuuuuu", 91);
System.out.println("ROLL NAME MARKS");
s1.show();
s2.show();
}
}
