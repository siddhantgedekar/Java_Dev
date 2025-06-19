// Constructor in java
public class Constr {
    public static void main(String [] args) {
        Student s1 = new Student("Siddhant"); // passed arguments as the constructor has arguments to pass, when we defined it.
        s1.name = "Sid";
        s1.roll = 123;
        s1.password = "science";
        s1.marks[0] = 90;
        s1.marks[1] = 38;
        s1.marks[2] = 74;

        // copying the constructor s1 to s2
        Student s2 = new Student(s1);// this will call the copy constructor in the Student class.
        // s2 will have the values/properties of s1 now.
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        for(int i=0; i<s1.marks.length;i++) {
            System.out.print(" "+s1.marks[i]);
        }System.out.println();

        // lets try changing
        s2.password = "New Science";
        System.out.println(s2.password);// it works
        System.out.println("Before deep copy constructor");
        System.out.println(s1.marks[2]);
        System.out.println(s2.marks[2]);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    Student(){
        // do something
    }
    // constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
        System.out.println("Constructor is called..");
    }
    // in case the constructor is not manually created it'll automatically be called but no initilization will be done.
    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        for(int i=0; i<marks.length;i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}