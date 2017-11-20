public class ControlFlowExercises {

    public static void main(String[] args) {

        //while loop
//        int i = 5;
//
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;

        //do while  loop
//        int i = 0;
//
//        do {
//
//            i++;
//            i++;
//            System.out.println(i);
//
//        } while (i <= 98);

        //Alter loop by 5

//        int i = 100;
//
//        do {
//
//            i -= 5;
//            System.out.println(i);
//
//        } while (i >= -10);

        //Alter to start at 2

//          long i = 2;
//        do {
//
//            System.out.println(i);
//          i *= i
//        } while (i <= 1000000);


        //FizzBuzz
      for (int i = 1; i <= 100; i++) {

          if (i % 3 == 0 && i % 5 == 0) {
              System.out.println("FizzBuzz");
          } else if (i % 3 == 0) {
              System.out.println("Fizz");
          } else if (i % 5 == 0){
              System.out.println("Buzz");
          }  else {
              System.out.println(i);
          }

      }
        String firstName = "Fred";
        short memberId = 1425;
        System.out.printf("Member " + firstName+" "+ "---- " +"#"+memberId);

    }
}

