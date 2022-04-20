package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {

    }

    private String studentName;

    private static ArrayList<Integer> gradesList = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        this.gradesList.add(grade);
    }

//    public static double getGradeAverage(){
//        double gradesAdded = 0;
//        int numGrades = 0;
//        for(int grade : gradesList) {
//            numGrades++;
//            gradesAdded += grade;
//        }
//        return gradesAdded/numGrades;
//    }

    public double getGradeAverage(){
        int totalPoints = this.gradesList.stream().reduce(0, (sum, currentGradeElement) -> {
            System.out.println("The sums is currently: " + sum);
            System.out.println("The current grade element is: " + currentGradeElement);
            System.out.println("********************************");
            return sum + currentGradeElement;
        });
        return (double) totalPoints / this.gradesList.size();
    }
}
