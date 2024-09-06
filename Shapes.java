/*
Q15. Write a java program to create an interface that consists of a method to display volume() as an abstract method and redefine the method in derived classes to suit their requirements.
Create classes called Cone, Hemisphere, and Cylinder that implements the interface using these three classes, design  a program that will accept dimensions of a cone, cylinder and hemisphere and display the volume
vol. of cone = 1/3 pi r square h
vol. of hemisphere = 2/3 pi r cube
vol. of cylinder = pi r square h.
 */
interface Shape
{
    double volume();
}
class Cone implements Shape 
{
    int r, h;
    Cone(int r, int h) {
        this.r = r; 
        this.h = h;
    }
    public double volume() {
        return 1/3.0 * 3.14 * r * r * h;
    }
}
class Hemisphere implements Shape
{
    int r;
    Hemisphere(int r) {
        this.r = r;
    }
    public double volume() {
        return 2/3.0 * r * r * r;
    }
}
class Cylinder implements Shape
{
    int r, h;
    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }
    public double volume() {
        return 3.14 * r * r * h;
    }
}
public class Shapes
{
    public static void main(String args[]) {
        Shape a = new Cone(5, 5);
        Shape b = new Hemisphere(5);
        Shape c = new Cylinder(5, 5);

        System.out.println("Cone Volume: " + a.volume());
        System.out.println("Hemisphere Volume: " + b.volume());
        System.out.println("Cylinder Volume: " + c.volume());
    }
}
/*
OUTPUT:
Cone Volume: 130.83333333333334
Hemisphere Volume: 83.33333333333331
Cylinder Volume: 392.5
 */