import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String bobResponse;
        Scanner sc = new Scanner(System.in);

        System.out.println("Talk to Bob");
        bobResponse = sc.nextLine();

        if (bobResponse.endsWith("?")) {
            System.out.println("Sure");

        }   else if (bobResponse.endsWith("!")){
            System.out.println("Whoa chill out!");
        }   else if (bobResponse.equals("")){
            System.out.println("Fine. Be that way!");
        }   else  {
            System.out.println("Whatever");
        }

    }
}
