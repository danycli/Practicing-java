package P3;
import java.awt.*;
public class PrimitiveVsReference{
    public static void main(String[] args){
        //Primitive
        int x = 1;
        // int y = x;
        // x = 5;
        // System.out.println(y);
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 9;
        point1.y = 10;
        System.out.println(point2);
        System.out.println("Value of X is "+x+"");
    }
}