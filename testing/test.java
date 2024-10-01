package testing;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter value one: ");
        int num1 = sc.nextInt();
        System.out.println("Enter value two: ");
        int num2 = sc.nextInt();
        addition(num1, num2);
        subtraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        modulus(num1, num2);
        sc.close();
    }

public static void addition(int num1, int num2){
    int sum = num1 + num2;
    System.out.println("The total is: " + sum);
}

public static void subtraction(int num1, int num2){
    int diff = num1 - num2;
    System.out.println("The difference is: " + diff);
}

public static void multiplication(int num1, int num2){
    int multi = num1 * num2;
    System.out.println("The product is: " + multi);
}

public static void division(int num1, int num2){
    int divi = num1 / num2;
    System.out.println("The quotient is: " + divi);
}

public static void modulus(int num1, int num2){
    int mod = num1 % num2;
    System.out.println("The remainder is: " + mod);
}
}