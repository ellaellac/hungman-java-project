import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);


    //variables

    private char userInput;

    private ArrayList<String> guessedLetter = new ArrayList<>();

    private int letterLeft;


    //getter and setter

    public char getUserInput() {
        return userInput;
    }

    public void setUserInput(char userInput) {
        this.userInput = userInput;
    }

    public ArrayList<String> getGuessedLetter() {
        return guessedLetter;
    }

    public void setGuessedLetter(ArrayList<String> guessedLetter) {
        this.guessedLetter = guessedLetter;
    }

    public int getLetterLeft() {
        return letterLeft;
    }

    public void setLetterLeft(int letterLeft) {
        this.letterLeft = letterLeft;
    }

    //Method
    public void displayInput() {
        System.out.println("Please enter a letter : ");
        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.length() > 1) {
            System.out.println("One Letter Only! Please enter again.");
            displayInput();

        } else if (guessedLetter.contains(userInput)) {
            System.out.println("You entered the same letter. Please enter again.");
            displayInput();

        } else if (!Character.isLetter(userInput.charAt(0))){
            System.out.println("That's not a letter! Please input a letter.");
            displayInput();

        } else {
            setUserInput(userInput.charAt(0));
            guessedLetter.add(userInput);
            System.out.println("You entered: " + guessedLetter);
        }

    }

    public void checkUserInput() {
        int letterLeft = 0;
        for (int i = 0; i < Words.getRandomWord().length(); i++) {
            if (guessedLetter.contains(Words.getRandomWord().charAt(i) + "")) {
                System.out.print(Words.getRandomWord().charAt(i));
            } else {
                System.out.print('_');
                letterLeft++;
            }
        }
        this.letterLeft = letterLeft;

        if (!Words.getRandomWord().contains(userInput + "")) {
            Player.deductLife();
        }

    }


}
