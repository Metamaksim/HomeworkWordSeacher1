import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(WorldSeacher.worldSeacher("страд", "War&Peace.txt"));
        System.out.println(Multiplication.multiplication());
        System.out.println(ScannerFiles.countExamplesInFile("War&Peace.txt","страд" ));

    }
}