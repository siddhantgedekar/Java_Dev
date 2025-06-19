public class Question1 {
    public static void main(String [] args) {
        Student s = new Student();
        // Fill here
        s.name = "Siddhant";
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int marks;
}