package grades;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static util.Input.getString;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = getStudents();

        boolean keepSearching = true;
        do {
            initGradesApp(students);
            String userContinue = getString("Would you like to search again? (y/n)");
            if (userContinue.equalsIgnoreCase("y")) {
                keepSearching = true;
            } else {
                keepSearching = false;
            }
        } while (keepSearching);
    }

    private static void initGradesApp(HashMap<String, Student> students){
        System.out.println("Student Github Usernames:");
        System.out.println("\n");
        for(String key : students.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n");
        String userQuery = getString("Which student would you like to see more info about?");

        if (students.containsKey(userQuery)) {
            Student chosenOne = students.get(userQuery);
            System.out.println("Name: " + chosenOne.getStudentName());
            System.out.println("GitHub Username: " + userQuery);
            System.out.println("Grade Average: " + chosenOne.getGradeAverage());
        } else {
            System.out.println("The user " + userQuery + " does not exist");
        }
    }

    private static HashMap<String, Student> getStudents() {
        Student student1 = new Student("Kyle");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(97);


        Student student2 = new Student("Rhagen");
        student2.addGrade(90);
        student2.addGrade(93);
        student2.addGrade(91);

        Student student3 = new Student("Bob");
        student3.addGrade(79);
        student3.addGrade(85);
        student3.addGrade(84);


        Student student4 = new Student("Penelope");
        student4.addGrade(100);
        student4.addGrade(100);
        student4.addGrade(98);

        HashMap<String, Student> students = new HashMap<>();

        students.put("JavanaMan", student1);
        students.put("GittinCode", student2);
        students.put("Cobold", student3);
        students.put("ConfusedApe", student4);
        return students;
    }
}
