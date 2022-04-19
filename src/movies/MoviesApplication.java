package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

import static movies.MoviesArray.findAll;
import static util.Input.getString;


public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userContinues = true;
        do {
            System.out.println("Would you like to view all movies or view a specific genre?");
            int userCategoryChoice = Input.getInt("Enter 1 - 5\n" +
                    "1. All\n" +
                    "2. Drama\n" +
                    "3. Horror\n" +
                    "4. Musical\n" +
                    "5. Sci-fi");

            Movie[] allMovies = findAll();

            switch (userCategoryChoice) {
                case 1:
                    for (int i = 0; i < allMovies.length; i++) {
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                    }
                    break;
                case 2:
                    for (int i = 0; i < allMovies.length; i++) {
                        if(allMovies[i].getCategory().equalsIgnoreCase("drama")){
                            System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < allMovies.length; i++) {
                        if(allMovies[i].getCategory().equalsIgnoreCase("horror")){
                            System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < allMovies.length; i++) {
                        if(allMovies[i].getCategory().equalsIgnoreCase("musical")){
                            System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < allMovies.length; i++) {
                        if(allMovies[i].getCategory().equalsIgnoreCase("scifi")){
                            System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                        }
                    }
                    break;
            }

            System.out.println("Would you like to search again? (y/n)");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("y")) {
                userContinues = true;
            } else {
                userContinues = false;
            }

        } while (userContinues);
    }
}
