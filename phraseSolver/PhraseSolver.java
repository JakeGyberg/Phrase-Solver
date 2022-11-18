/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */


  public void play()
  {
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    String winner = "";
    while (!solved) 
    {
      //Directions/info/input
      System.out.println("Points:   " + player1.getName() +" " + player1.getPoints() + "   " + player2.getName() + " " + player2.getPoints());
      System.out.println("Phrase: " + board.getPhrase());
      System.out.println("Player " + currentPlayer + " guess a letter");
      String guess = input.nextLine();

      //Add Points
      board.setLetterValue();
      if (board.guessLetter(guess)) {
        //add points
        if (currentPlayer == 1) {
          player1.updatePoints(board.getCurrentLetter());
        } else {
          player2.updatePoints(board.getCurrentLetter());
        }
      }

      System.out.println("\n");

      //Change the player after each turn
      currentPlayer = currentPlayer * (currentPlayer % 2) + 1;

      //Game ending
      if (board.isSolved(guess)) {
        solved = true;
        if (player1.getPoints() > player2.getPoints()) {
          winner = player1.getName();
        } else {
          winner = player2.getName();
        }
        if (currentPlayer == 1) {
          System.out.println("\n\n" + player1.getName() + " wins");
        } else {
          System.out.println("\n\n" + player2.getName() + " wins");
        }
        
      }
    } 
   
  }
  
}