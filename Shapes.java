import java.util.*;
import java.util.Scanner;
public class Shapes{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
     System.out.println("1 = circle, 2 = square, 3 = triangle, 4 = rectangle");
        int object = input.nextInt();

        if (object == 1){
          System.out.println("Enter your circle radius in here: ");
          double radius = input.nextDouble();
          double circlearea = radius * radius * 3.14;
          System.out.println("The area of the circle is:" +circlearea);
        }
        else if (object == 2){
          System.out.println ("Enter your square Length: ");
          double side = input.nextDouble();
          double Area = side * side;
          System.out.println ("The Area of the square is:"+Area);
        }
        else if (object == 3){
          System.out.println ("Enter your triangle height: ");
          double height = input.nextDouble();
          System.out.println ("Enter your triangle base Length2: ");
          double Length2 = input.nextDouble();
          double tArea = height * Length2 * 0.5;
          System.out.println ("The area of the triangle is:" +tArea);
        }
        else if (object == 4){
          System.out.println("Enter your rectangle width: ");
          double width = input.nextDouble();
          System.out.println ("Enter your rectangle Length3: ");
          double Length3 = input.nextDouble();
          double Area2 = width * Length3;
          System.out.println("The area of the rectangle is:" +Area2);
        }
      else{
        System.out.println("Error pleaese enter a number between 1 to 4");
        }
  }//end main
}// end class
