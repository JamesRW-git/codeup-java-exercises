import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String fileName = "groceries.txt";
//        createFile("data", "info.txt");
//        writeGroceryList("data", "groceries.txt");
        System.out.println("Before");
        getStringsFromFile(directory, fileName);
//        addStringsToFile("data", "groceries.txt", "eggs");
        replaceStringInFile(directory, fileName, "cream", "milk");
        System.out.println("\n");
        System.out.println("After");
        getStringsFromFile(directory, fileName);
    }

    public static void createFile(String directory, String filename) throws IOException {
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
            System.out.println("Created directory: " + directory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile((dataFile));
            System.out.println("Created file: " + filename);
        }
    }

    public static void writeGroceryList(String directory, String fileName) throws IOException {
        List<String> groceryList = Arrays.asList("coffee", "sugar", "milk", "WMDs");
        Path filepath = Paths.get(directory, fileName);
        Files.write(filepath, groceryList);
    }

    public static void getStringsFromFile(String directory, String fileName) throws IOException {
        Path filePath = Paths.get(directory, fileName);
        List<String> printList = Files.readAllLines(filePath);

        for (int i = 0; i < printList.size(); i+=1) {
            System.out.println((i + 1) + ": " + printList.get(i));
        }
    }

    public static void addStringsToFile(String directory, String fileName, String addedString) throws IOException {
        Files.write(
          Paths.get(directory, fileName),
          Arrays.asList(addedString),
                  StandardOpenOption.APPEND
        );
    }

    public static void replaceStringInFile(String directory, String fileName, String toReplace, String replacedWith) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(directory, fileName));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equalsIgnoreCase(toReplace)) {
                newList.add(replacedWith);
                continue;
            }
            newList.add(line);
        }
        Files.write(Paths.get(directory, fileName), newList);
    }

}


