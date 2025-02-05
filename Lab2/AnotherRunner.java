package Lab2;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Integer[] intsArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        ////
        
        Car car1 = new Car ("Camry", 45000);
        Car car2 = new Car("Explorer", 78500);
        Car car3 = new Car("Silverado", 10230);
        Car[] cars = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
    }
}