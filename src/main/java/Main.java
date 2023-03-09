public class Main {
    public static void main(String[] args) {
        //Math operators
        int a = 2;
        int b = 10;
        int c = 7;

        int sum = a + b;
        System.out.println("sum is: " + sum);

        int diff = b - a;
        System.out.println("diff is: " + diff);

        int mult = a * b;
        System.out.println("mult is: " + mult);

        int div = b / a;
        System.out.println("div is: " + div);

        int modDiv = c / a;
        System.out.println("mod div is: " + modDiv);

        //comparison operators
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a >= b = " + (a >= b) );
        System.out.println("a <= b = " + (a <= b) );

        //logical operators
        if ((a > 0) && (b > 0)) {
            System.out.println("Positive numbers");
        }
        else if ((a < 0) && (b < 0)) {
            System.out.println("Negative numbers");
        }
        else if (((a > 0) && (b < 0) || (a < 0) && (b > 0))) {
            System.out.println("Positive or negative numbers");
        }
        else {
            System.out.println("no one category");
        }

        //ternary operator
        boolean d = a > b ? true : false;

        //int overloading
        int maxValue = Integer.MAX_VALUE;
        int overloadedInt = maxValue + 1;
        System.out.println("overloading int: " + overloadedInt);

        //int and double combinations
        int intVal = 10;
        double doubleVal = 12.5;
        //result to double
        System.out.println("sum of int and double: " + (intVal + doubleVal));
    }
}
