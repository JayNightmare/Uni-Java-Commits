<<<<<<< HEAD
public class Calculator {
=======
public class Calculator { 
>>>>>>> 63a74e1723292cf36939f621ff6b1bc5acf04f0e
    // Step 1a: Create an functional interface
    public static void main(String[] args) {
        // Step 1b: Create an object of functional interface
        WelcomeMessage welcome = () -> System.out.println("Welcome to my Calculator");

        // Step 1c: Call the method of functional interface
        welcome.sayWelcome();

        // Step 2b: Implement CalcFunction operations
        CalcFunction add = (a, b) -> a + b;
        CalcFunction subtraction = (a, b) -> a - b;
        CalcFunction multiplication = (a, b) -> a * b;
        CalcFunction division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };

        // Step 3b: Implement ExtraFunction operations
        ExtraFunction square = a -> a * a;
        ExtraFunction cube = Math::sqrt;

        // Step 2c: Test operations
        int x = 10;
        int y = 5;
        double z = 5;


        // Step 3c: Test operations

        // Step 4c: Use getResult to display results of calculations
        getResult(x, y, add, "Adding");            
        getResult(x, y, subtraction, "Subtracting");   
        getResult(x, y, multiplication, "Multiplying");   
        getResult(x, y, division, "Dividing");        

        getResult(z, square, "Squaring");           
        getResult(z, cube, "Square Root"); 
    }
    
    // Step 1a: Create Interface
    @FunctionalInterface
    interface WelcomeMessage {
        void sayWelcome();
    }

    // Step 2a: Create Interface
    @FunctionalInterface
    interface CalcFunction {
        int intOperation(int a, int b);
    }

    // Step 3a: Create Interface
    @FunctionalInterface
    interface ExtraFunction {
        double ExtraFunction(double a);
    }

    // Step 4a: Method to get results of CalcFunction operations
    private static void getResult(int a, int b, CalcFunction operation, String description) {
        int result = operation.intOperation(a, b);
        System.out.println(description + " " + a + " and " + b + ": " + result);
    }

    // Step 4b: Method to get results of ExtraFunction operations
    private static void getResult(double a, ExtraFunction operation, String description) {
        double result = operation.ExtraFunction(a);
        System.out.println(description + " " + a + ": " + result);
    }
}


