public class Display {
                private String oneWord;

                public String getOneWord() {
                     return oneWord;
                 }

                 public void setOneWord(String oneWord) {
                     this.oneWord = oneWord;
                 }

                 //Method

                public void guessWord(String oneWord){
                    int wordLength = oneWord.length();
                    String underline = "_ ";
                    String hideWord = underline.repeat(wordLength);

                    System.out.println("Guess a word : " + hideWord + "(" + wordLength + ")");
                }


}
