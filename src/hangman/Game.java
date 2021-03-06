/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

public class Game {

   
    public Game() {
    }

    public void displayWinningMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Congratulations. You win!"
             + "\n\t*******************************************************************************");
    }

    public void displayLosingMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Sorry. You lose. Better luck next time!" 
             + "\n\t*******************************************************************************");
    }

    public void playTheGame () {
        Gallows gallows = new Gallows();
        gallows.displayGallows();
        
        Alphabet alphabet = new Alphabet();
        alphabet.makeAlphabet();
        alphabet.displayAlphabet('_');
        
        MysteryWord mysteryWord = new MysteryWord();
        mysteryWord.displayMysteryWord('_');
        mysteryWord.guessesLeft();
        
        char mysteryLetter;
                
        while (mysteryWord.winGame() == false && mysteryWord.loseGame() == false){
            
            mysteryLetter = mysteryWord.getLetter();
            
            if (mysteryLetter == '1') {
                System.out.println("We will eventually build a real menu."); //this will be replaced with call to the menu class
            }
            else {
                gallows.displayGallows();
                alphabet.displayAlphabet(mysteryLetter);
                mysteryWord.displayMysteryWord(mysteryLetter);
                mysteryWord.guessesLeft();
            }
        }
        
        if (mysteryWord.winGame()){
            displayWinningMessage();
        }
        else {
            displayLosingMessage();
        }
        
    }
}
