import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition(3,5));
        System.out.println(Subtraction(5, 3));
        System.out.println(Multiplication(5, 3));
        System.out.println(Division(5, 3));
        System.out.println(Modulus(12, 5));

    }

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Division(int num1, int num2){
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }

  

}