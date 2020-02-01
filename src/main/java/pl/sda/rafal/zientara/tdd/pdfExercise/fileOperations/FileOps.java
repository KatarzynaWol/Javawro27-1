package pl.sda.rafal.zientara.tdd.pdfExercise.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOps {

    private static  String path = "C:\\Users\\matni\\IdeaProjects\\JAVAWROtest\\src\\main\\java\\pl\\sda\\rafal\\zientara\\tdd\\pdfExercise\\fileOperations\\data\\sessions.txt";

    public static void writeStringToFile (String value) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(path);
        out.println(value);
        out.close();
    }

    public static String readStringFromFile() throws FileNotFoundException {
        StringBuilder temp = new StringBuilder();
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            temp.append(sc.nextLine());
        }
        return temp.toString();
    }

}
