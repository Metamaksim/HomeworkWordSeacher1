import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFiles {
    public static String countExamplesInFile(String filePath, String search) {
        int count = 0;
        try {
            File f1=new File(filePath);
            Scanner scanner = new Scanner(f1);
            String s = ("Найдено " + count + " похожих слова в файле");
            scanner.useDelimiter("[^a-zA-Z] ");
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.contains(search)) {
                    count++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        return "Найдено " +count+ " похожих слова в файле";
    }
}
