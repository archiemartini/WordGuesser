/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wordguesser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testHasInitialCounter10() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.counter, Integer.valueOf(10));
  }

  @Test public void testGetRemainingAttempts() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  
}
