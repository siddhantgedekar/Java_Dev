// scanner class import
import java.util.*;

public class BillOfPurchase{
    public static void main(String[] args){
        // variables to store item cost
        int pencil, pen, eraser;
        // GST
        float gst = 0.18f;
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of Pencil: ");
        pencil = sc.nextInt();
        System.out.print("Enter cost of Pen: ");
        pen = sc.nextInt();
        System.out.print("Enter cost of Eraser: ");
        eraser = sc.nextInt();

        // print bill without GST
        // System.out.println("************************************");
        // System.out.println("Items Purchased       Cost in rupee");
        // System.out.println("Pencil               "+pencil);
        // System.out.println("Pen                  "+pen);
        // System.out.println("Eraser               "+eraser);
        // System.out.println("--------------------------------");
        // System.out.println("Total items: 3       Total amount: "+(pencil+pen+eraser));

        // Bill with GST of 18%
        System.out.println("************************************");
        System.out.println("Items Purchased       Cost in rupee");
        System.out.println("Pencil               " + (pencil + pencil*gst));
        System.out.println("Pen                  " + (pen + pen*gst));
        System.out.println("Eraser               " + (eraser + eraser*gst));
        System.out.println("--------------------------------");
        float total = (pencil+pen+eraser);
        System.out.println("Total items: 3       Total amount: " + total + " GST: " + total*gst);

        // Test
        int $ = 23;
        System.out.print($);
    }
}