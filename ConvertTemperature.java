/*
Q14. Write a java program to implement abstract class and abstract method with following details:
Create a abstract base class Temperature
Data member - double temp
Method member - 
i) void setTempData(double)
ii) abstract void changeTemp()
Subclass Fahrenheit (subclass of Temperature) 
Data member - double ctemp
Method member -
Override abstract method changeTemp() to convert Fahrenheit temperature into degree Celsius by using formula and display converted temperature.
Subclass Celsius (subclass of Temperature)
Data member - double ftemp
Method member -
Override abstract method changeTemp() to convert degree Celsius into Fahrenheit temperature by using formula and display converted temperature.
*/
abstract class Temperature 
{
    double temp;
    void setTempData(double t) {
        temp = t;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature
{
    double ctemp;
    void changeTemp() {
        ctemp = 5.0/9 * (temp - 32);
        System.out.println("Celsius: " + ctemp);
    }
}
class Celsius extends Temperature
{
    double ftemp;
    void changeTemp() {
        ftemp = (9.0/5 * temp) + 32;
        System.out.println("Fahrenheit: " + ftemp);
    }
}
public class ConvertTemperature {
    public static void main(String args[]) {
        Temperature a = new Fahrenheit();
        Temperature b = new Celsius();

        a.setTempData(98.2);
        a.changeTemp();
        b.setTempData(32);
        b.changeTemp();
    }
}
/*
OUTPUT:
Celsius: 36.77777777777778
Fahrenheit: 89.6
 */