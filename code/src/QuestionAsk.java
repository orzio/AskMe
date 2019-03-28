import java.util.List;
import java.util.Scanner;

public class QuestionAsk {
    public static void ask(List<Word>wordList){

        //wczytywanie z konsoli
        boolean correctAnswers=false;
        System.out.println("Strart learing!!");
        System.out.println("- If you want to stop type: exit.(Please don't do that!)");
        System.out.println("You really know the meaing of the word when you type it correctly tree times");
        System.out.println("Translate:");
        while(!correctAnswers) {
            correctAnswers=true;
            for (Word w : wordList) {
                if(w.getCounter()<3) {
                    System.out.println(w.getPolishMeaining()+":");
                } else {
                    continue;
                }
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if(answer.equals("exit")){
                    System.out.println("You've learned a lot of new words. Bye bye!");
                    System.exit(0);
                }
                if(w.getEnglishMeaning().trim().equalsIgnoreCase(answer.trim())){
//                if(answer.trim().equals(w.getEnglishMeaning().trim())){
                    w.setCounter(1);
                    System.out.println("Correct Answer");
                } else {
                    System.out.println("Please, try again, correct answer: "+ w.getEnglishMeaning());
                }
            }
            for(Word w:wordList){
                if(w.getCounter()<3){
                    correctAnswers=false;
                    break;
                }
            }
        }

    }
}
