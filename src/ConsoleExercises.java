import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        //Exercise 1
//        int userNum;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number");
//        userNum = sc.nextInt();
//
//        System.out.println("You entered: --> \"" + userNum + "\" <--");

        //Exercise 2
//        String userInput;
//        String userInputTwo;
//        String userInputThree;
//
//        Scanner ui = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        userInput = ui.nextLine();
//        System.out.println("Enter something: ");
//        userInputTwo = ui.nextLine();
//        System.out.println("Enter something: ");
//        userInputThree = ui.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //Exercise 3 & 4
//          String userSentence;
//
//          Scanner sc = new Scanner(System.in);
//
//          System.out.println("Enter a sentence: ");
//          userSentence = sc.nextLine();
//          System.out.println("You entered: --> \"" + userSentence + "\" <--");

        //Exercise 5
//
//            int width;
//            int length;
//
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("Enter the length");
//            length = sc.nextInt();
//            System.out.println("Enter the width");
//            width = sc.nextInt();
//
//            int area = length * width;
//            System.out.println("The area of the room is: " + area );
//
//            int perimeter = 2*(length + width);
//            System.out.println("The perimeter of the room is : " + perimeter);

        //Bonus

            float width;
            float length;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the length in decimal number");
            length = sc.nextFloat();

            System.out.println("Enter the width in decimal number");
            width = sc.nextFloat();

            float area = length * width;
            System.out.println("The area of the room is: " + area);


    }
}
