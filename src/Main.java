
public class Main {
    public static void main(String[] args) {
        //Task2
        Car firstCar = new Car();
        firstCar.brand = "Audi";
        firstCar.model = "Quattro";
        firstCar.modelYear = 2020;
        firstCar.engineStart();
        Car secondCar = new Car();
        secondCar.brand = "VW";
        secondCar.model = "Passat";
        secondCar.modelYear = 2024;
        secondCar.engineStop();

        //Task3
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.isGreater();

        //Task4
        NumberManipulator number1 = new NumberManipulator();
        number1.incrementByOne();
        number1.decrementByOne();
    }
}
