/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wordguesser;

public class Game {

    public String getWordToGuess() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(0);
            if (i == 0) {
                str.append(currentLetter);
            } 
            str.append("_");
        } 
        return str.toString();
    }

    public Integer getRemainingAttempts() {
        return counter;
    }

    String word;
    Integer counter;
    Game(String chosenWord) {
        word = chosenWord;
        counter = 10;
    }

    public static void main(String[] args) { }
}
