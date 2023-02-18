public class Hangman {
    Input input = new Input();

    public void runGame() {

        //Player life
        while (Player.getLife() > 0) {
            input.displayInput();
            input.checkUserInput();
            System.out.println("");
            System.out.println("Life : " + Player.getLife());

            if (Player.getLife() == 0) {
                System.out.println("Game Over!");
            } else if (input.getLetterLeft() == 0) {
                System.out.println("Congrats!");
                return;
            }
        }

    }


}
