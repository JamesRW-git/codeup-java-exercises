package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        student1.addGrade(100);
        student1.addGrade(50);
        System.out.println(student1.getGradeAverage());
    }

    private String studentName;

    private ArrayList<Integer> gradesList;

    public Student(String studentName) {
        this.studentName = studentName;
        this.gradesList = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        gradesList.add(grade);
    }

    public double getGradeAverage(){
        double gradesAdded = 0;
        int numGrades = 0;
        for(int grade : gradesList) {
            numGrades++;
            gradesAdded += grade;
        }
        return gradesAdded/numGrades;
    }
}
