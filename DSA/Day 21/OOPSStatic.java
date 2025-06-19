public class OOPSStatic {
    public static void main(String [] args) {
        Student s = new Student();
        // static variable changes for everything, as it is generated once only.
        s.schoolName = "BJT";
        System.out.println(s.schoolName);
        Student s1 = new Student();
        System.out.println(s1.schoolName);
    }
}

class Student {
    String name;
    int roll;
    // static variable
    static String schoolName; // it'll change value for all the implementations
    void setName(String name){
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}