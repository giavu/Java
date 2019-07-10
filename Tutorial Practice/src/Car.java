/**
 * The Car.java program implements an application that implements a Car class and simply display
 * instance variables of a Car object set by default.
 *
 * @author kathrynhodge
 * @author Gia Vu
 * @version 1.0 2016/01/01
 *
 */
public class Car {
    int     minSpeed    =   0   ;    //  mph (miles per hours)
    int     maxSpeed    = 100   ;    //  mph (miles per hours)
    double  weight      = 4097  ;    //  lb (pounds)  ;
    boolean isTheCarOn  = false ;    // is the car turned on or off?
    char    condition   = 'A'   ;    // a single character describing the condition of the car
    String  color       = "Red" ;    // a string represents the color of the car

    public void printVariables(){
        System.out.println(minSpeed);
        System.out.println(maxSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(color);
    }

    public static void main(String[] args){
        //Create a Car instance (a new Car Object)
        Car car = new Car();
        car.printVariables();
    }
}