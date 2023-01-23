import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Words word = new Words();
        Display display = new Display();
        Input input = new Input();

        String oneWord = word.getRandomWord();

        display.setOneWord(oneWord);
        input.setOneWord(oneWord);
        System.out.println(display.getOneWord());

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

    //1. create a word list
    //2. Function --> random select the word
    //3. length of words --> show "_ _ _"
    //4. get User Input (Scanner)
    //5. userInput
    //6. for loop the letters in userInput
    //7. control flow : lose life || displayed the matched letter && store the matched input Letter && lives left
}