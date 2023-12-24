import java.util.*;
import java.io.*;

public class MyApplication{
    public static void main(String[] args) throws FileNotFoundException  {

        File sourcefile = new File("C:\\Users\\user\\IdeaProjects\\untitled\\src\\source");
        Scanner scnr = new Scanner(sourcefile);
        Point number1 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number2 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number3 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number4 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number5 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number6 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number7 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number8 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number9 = new Point(scnr.nextInt(), scnr.nextInt());
        Point number10 = new Point(scnr.nextInt(), scnr.nextInt());

        Shape polygon = new Shape();
        polygon.addPoint(number1);
        polygon.addPoint(number2);
        polygon.addPoint(number3);
        polygon.addPoint(number4);
        polygon.addPoint(number5);
        polygon.addPoint(number6);
        polygon.addPoint(number7);
        polygon.addPoint(number8);
        polygon.addPoint(number9);
        polygon.addPoint(number10);



        System.out.println(polygon.perimeter());
        System.out.println(number2.toString());
        System.out.println(polygon.longestSide());
        System.out.println(polygon.averageSide());

    }
}