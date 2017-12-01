package grades;
import java.util.ArrayList;

public class Student {
    private String StudentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        StudentName = studentName;
        grades = new ArrayList<>();

    }

    // returns the student's name
    public String getName(){
        return StudentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;

        for (int grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }

    public static void main(String[] args) {
        Student studentName1 = new Student("Bob");
        studentName1.addGrade(80);
        studentName1.addGrade(90);
        studentName1.addGrade(70);
        System.out.println(studentName1.getGradeAverage() +" "+ studentName1.getName());

        Student studentName2 = new Student("Bill");
        studentName2.addGrade(70);
        studentName2.addGrade(80);
        studentName2.addGrade(90);
        System.out.println(studentName2.getGradeAverage() +" "+ studentName2.getName());

        Student studentName3 = new Student("Paul");
        studentName3.addGrade(70);
        studentName3.addGrade(60);
        studentName3.addGrade(100);
        System.out.println(studentName3.getGradeAverage() +" "+ studentName3.getName());

    }
}
