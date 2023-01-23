import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Words word = new Words();
        Display display = new Display();
        Input input = new Input();

        String oneWord = word.getRandomWord();
        display.setOneWord(oneWord);
        input.setOneWord(oneWord);

        display.guessWord(oneWord);

        while (input.getLife() > 0) {
            input.displayInput();
            input.checkUserInput();
            System.out.println("");
            System.out.println("Life : " + input.getLife());

            if (input.getLife() == 0  ) {
                System.out.println("Game Over!");
            } else if (input.getLetterLeft() == 0) {
                System.out.println("Congrats!");
                return;
            }
        }


    }

}