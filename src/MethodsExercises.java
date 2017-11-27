import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {


        System.out.println(Addition(3,5));
        System.out.println(Subtraction(3, 4));
        System.out.println(Multiplication(5, 3));
        System.out.println(Division(5, 3));
        System.out.println(Modulus(12, 5));




    }

    public static int Addition(int num1, int num2) { return num1 + num2;}

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) { return num1 * num2; }

    public static int Division(int num1, int num2){ return num1 / num2; }

    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }




    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an Int between " + min + " and  " + max);
        int userInt = scan.nextInt();

        if (userInt < min || userInt > max){
            return getInteger(min, max);
        } else {
            return userInt;
        }
    }

}