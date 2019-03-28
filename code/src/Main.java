import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        FileLoader input = new FileLoader();
        try {
            input.dataLoader();
        } catch (IOException e){
            System.out.println("Catch");
            e.printStackTrace();
        }

        List<Word> wordList = new LinkedList<>();
        for(int i=0; i<input.getPol().size(); i++){
            wordList.add(new Word(input.getPol().get(i),input.getEng().get(i)));
        }

        QuestionAsk.ask(wordList);

    }
}
