public class OOPS {
    public static void main(String [] args) {
        Pen p1 = new Pen();
        p1.setColor("Green");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
        Bank b1 = new Bank();
        b1.setPassword("siddhantGedekar");
        System.out.println(b1.password);
    }
}
// Basic structure of class
class Pen {
    // attributes/properties
    String color;
    int tip;

    // function/behavior
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
// Access modifier
class Bank {
    public String username;
    private String password;
    // method to access password
    public void setPassword(String pwd){
        password = pwd;
    }
}