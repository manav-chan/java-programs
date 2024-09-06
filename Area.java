/*
Q13. Write a java program to calculate the area of rectangle, square, and circle. Create an abstract class "Shape" with three abstract methods rectangleArea(), taking two parameters, squareArea(), circleArea() taking one parameter each. Now create another class Area containing all three methods for printing area of respective shapes.
*/
abstract class Shape
{
    public abstract int rectangleArea(int a, int b);
    public abstract int squareArea(int a);
    public abstract double circleArea(int r);
}
public class Area extends Shape 
{
    public int rectangleArea(int a, int b) {
        return a * b;
    }
    public int squareArea(int a) {
        return a * a;
    }
    public double circleArea(int r) {
        return 3.14 * r * r;
    }
    public static void main(String args[]) {
        Area obj = new Area();
        System.out.println("Rectangle: " + obj.rectangleArea(2, 3));
        System.out.println("Square: " + obj.squareArea(2));
        System.out.println("Cirlce: " + obj.circleArea(2));
    }
}
/*
OUTPUT:
Rectangle: 6
Square: 4
Cirlce: 12.56
 */