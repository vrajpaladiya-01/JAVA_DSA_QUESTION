import java.util.Scanner;

public class gstbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of pencile : ");
        float pencile = sc.nextFloat();

        System.out.print("Enter price of pen : ");
        float pen = sc.nextFloat();

        System.out.print("Enter price of eraser : ");
        float eraser = sc.nextFloat();

        float sum = pencile + pen + eraser;
        System.out.println("Without GST bill is : " + sum);

        float gst = (sum*18)/100;
        System.out.println("GST is : " + gst);

        float total = (sum + gst);
        System.out.println("Total GST bill is : " + total);

        sc.close();
    }
}
