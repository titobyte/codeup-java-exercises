package grades;
import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student studentName1 = new Student("Bob");
        studentName1.addGrade(80);
        studentName1.addGrade(90);
        studentName1.addGrade(70);
        System.out.println(studentName1.getGradeAverage() + " " + studentName1.getName());

        Student studentName2 = new Student("Bill");
        studentName2.addGrade(70);
        studentName2.addGrade(80);
        studentName2.addGrade(90);
        System.out.println(studentName2.getGradeAverage() + " " + studentName2.getName());

        Student studentName3 = new Student("Paul");
        studentName3.addGrade(70);
        studentName3.addGrade(60);
        studentName3.addGrade(100);
        System.out.println(studentName3.getGradeAverage() + " " + studentName3.getName());

        students.put("BobCodes", studentName1);
        students.put("BillCodes", studentName2);
        students.put("PaulCodes", studentName3);


        displayMenu(students);

    }
    public static void displayMenu(HashMap<String, Student> students){
        System.out.println();
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
        for (String key : students.keySet()){
            System.out.println(key);
        }
    }


}
