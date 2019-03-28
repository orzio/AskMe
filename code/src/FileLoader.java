import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileLoader {
    private List<String> eng = new LinkedList<>();
    private List<String> pol = new LinkedList<>();

    public void dataLoader() throws IOException {
        String path = new java.io.File(".").getCanonicalPath();
        Scanner scanner = new Scanner(new File(path+"/words/wordList"));

        while(scanner.hasNextLine()){
            String tempLine = scanner.nextLine().trim();
            if(!tempLine.equals("")){
                String line[] = tempLine.split("--");
                pol.add(line[0]);
                eng.add(line[1]);
            }
        }
        scanner.close();
    }

    public List<String> getEng() {
        return eng;
    }

    public List<String> getPol() {
        return pol;
    }
}