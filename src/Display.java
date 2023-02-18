public class Display {

    //Method

    public void guessWord() {
        int wordLength = Words.getRandomWord().length();
        String underline = "_ ";
        String hideWord = underline.repeat(wordLength);

        System.out.println("Guess a word : " + hideWord + "(" + wordLength + ")");
    }

}
