public class Word {
    private String polishMeaining;
    private String englishMeaning;
    private int counter;

    public Word(String polishMeaining, String englishMeaning) {
        this.polishMeaining = polishMeaining;
        this.englishMeaning = englishMeaning;
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int number) {
        this.counter+=number;
    }

    public String getPolishMeaining() {
        return polishMeaining;
    }


    public String getEnglishMeaning() {
        return englishMeaning;
    }

}
