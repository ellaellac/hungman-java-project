import java.util.Random;

public class Words {
    Random random = new Random();
    //variables
    private String[] words = {"melon","brunch", "water", "wisdom", "life", "moral" ,"exist", "reason", "music", "justice", "time", "space", "sun", "death", "light", "human"};

    private String randomWord = words[random.nextInt(words.length)];


    public String getRandomWord() {
        return randomWord;
    }


}
