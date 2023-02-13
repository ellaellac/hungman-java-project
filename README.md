# hungman-java-project

# Overview:
- First Java Project
- Develop a simple hangman game using Java
- a class for storing words
- a class for the results of the guess
- a class for interaction 
- a class for connecting all classes together for running the game

# Game rules:
Core functionality:
- The program randomly selects a word.
- The program displays the word using the underscore character "_".
    - With the word "ELEPHANT" the game would display "_ _ _ _ _ _ _ _".
    - A underscore for each letter separated with a space.
- The player is prompted to enter a letter as a guess. The program needs to capture their guess.
    - If the letter is in the word the program should recognize this.
    - If the letter is not in the word the player loses a life.
    - The program should store the guesses.
   After a guess the program should print out the following:
    - The word with blanks / correct guesses re-displayed e.g E _ E _ _ _ _ _
    - The letters guessed so far e.g Letters guessed: E G
    - The amount of lives left e.g Lives: 8
- The game continues with the player guessing more letters until the player correctly guesses the word or
they lose all their lives.
