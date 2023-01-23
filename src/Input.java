import java.util.ArrayList;
import java.util.Scanner;

public class Input {
        Scanner scanner = new Scanner(System.in);


        //variables

        private String oneWord;

        public char userInput;

        ArrayList <String> guessedLetter = new ArrayList<>();

        public int life = 8 ;

        public int letterLeft;


        //getter

        public String getOneWord() {
                return oneWord;
        }

        public char getUserInput() {
                return userInput;
        }

        public int getLife() {
                return life;
        }

        public int getLetterLeft() {
                return letterLeft;
        }

        //setter

        public void setOneWord(String oneWord) {
                this.oneWord = oneWord;
        }

        public void setUserInput(char userInput) {
                this.userInput = userInput;
        }

        public void deductLife() {
                this.life = life - 1;
        }



        //Method
        public void displayInput() {
                System.out.println("Please enter a letter : " );
                String userInput = scanner.nextLine().toLowerCase();

                if (userInput.length() > 1) {
                        System.out.println("One Letter Only! Please enter again.");
                        displayInput();
                } else if (Character.isDigit(userInput.charAt(0))){
                        System.out.println("Please input a letter.");
                } else if (guessedLetter.contains(userInput)){
                        System.out.println("You entered the same letter. Please enter again");
                } else {
                        setUserInput(userInput.charAt(0));
                        guessedLetter.add(userInput);
                        System.out.println("You entered: " + guessedLetter);
                }

        }

        public void checkUserInput() {
                int letterLeft = 0;
                for (int i = 0; i < oneWord.length(); i++) {
                        if (guessedLetter.contains(oneWord.charAt(i)+ "")) {
                                System.out.print(oneWord.charAt(i));
                        } else {
                               System.out.print('_');
                                letterLeft++;

                        }
                }
                this.letterLeft = letterLeft;

                if (!oneWord.contains(userInput + "")) {
                     deductLife();
                }

        }



}
