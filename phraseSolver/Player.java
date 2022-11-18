/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private double points;

  /* your code here - constructor(s) */ 
  public Player() {
    name = "";
    points = 0.0;

    System.out.println("Enter player name");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    name = newName;
    System.out.println("Welcome " + name + "\n");

  }

  public Player (String inputName) {
    name = inputName;
    points = 0.0;
  }
  
  /* your code here - accessor(s) */ 
  public String getName()
  {
    return name;
  }
  
  public double getPoints()
  {
    return points;
  }

  /* your code here - mutator(s) */
  public void setName(String x)
  {
    name = x;
  }

  public void updatePoints (int val) 
  {
    points = points + val;
  }

}