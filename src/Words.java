import java.util.Random;

public class Words {
    private static Random random = new Random();

    private static String[] words = {"melon", "brunch", "water", "wisdom", "life", "moral", "exist", "reason", "music", "justice", "time", "space", "sun", "death", "light", "human"};

    private static String randomWord = words[random.nextInt(words.length)];


    //getter and setter


    public static String[] getWords() {
        return words;
    }

    public static void setWords(String[] words) {
        Words.words = words;
    }

    public static String getRandomWord() {
        return randomWord;
    }

    public static void setRandomWord(String randomWord) {
        Words.randomWord = randomWord;
    }
}
