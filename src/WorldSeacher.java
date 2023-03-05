import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorldSeacher {
    public static StringBuffer worldSeacher( String searchWord, String fileName) throws FileNotFoundException, IOException {

        int count = 0;
        StringBuffer result = new StringBuffer();
        FileInputStream fis = new FileInputStream(fileName); // указываем путь к файлу
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();
        String[] lines = new String(content, "UTF-8").split("\n"); // пишем кодировку нашем файла
        int i = 1;
        for (String line : lines) {
            String[] words = line.toLowerCase().split(" ");
            int j = 1;
            for (String word : words) {
                if (word.contains(searchWord)) {
                    count++;
                    String preresult = ("Найдено в " + i + "-й строке, " + j + "-е слово, всего слов найдено " + count + "\n");
                    result.append(preresult);
                }
                j++;
            }
            i++;
        }
        return result;
    }
}