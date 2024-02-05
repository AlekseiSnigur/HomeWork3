import java.util.Scanner;
    public class Calculator {
        Scanner scanner1 = new Scanner(System.in);
        public void addition(){
            System.out.println("Enter first number for addition and press enter: ");
            int int1 = scanner1.nextInt();
            System.out.println("Enter second number for addition and press enter: ");
            int int2 = scanner1.nextInt();
            int sum = int1 + int2;
            System.out.println("Addition result is: " + sum);
            scanner1.close();
        }
        public void  isGreater(){
            double d1 = 7.5;
            double d2 = 5.3;
            boolean compare = d1 > d2;
            System.out.println("Is first value greater, than second? " + compare);
        }
    }