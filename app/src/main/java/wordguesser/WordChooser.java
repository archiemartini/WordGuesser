package wordguesser;

import java.util.Random;

public class WordChooser {
 
  static final String[] DICTIONARY={"BAZINGA", "CHERRY", "PUMPKIN", "PISTACHIO", "GUMPTION", "GIRTH", "FLANGE"};

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }

}
