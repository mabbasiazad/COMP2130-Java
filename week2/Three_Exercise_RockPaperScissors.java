// Required: complete the code
// Optional: check if the user entered a valid move (r, p, or s) and ask the user to enter again if not valid
// Optional: repeat the game until the user wants to quit

import java.util.*; //for Random class and Arrays class

/**
 * exercise_2_RockPaperScissors
 */
public class Three_Exercise_RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(3); // chose randomly between 0, 1, 2
        String computerMove = rps[index];
    
        //get user move use scanner.nextLine() method
        Scanner scanner = new Scanner(System.in);
        String userMove = "";

        System.out.println("Enter your move: rock, paper, or scissors");
        userMove = scanner.nextLine();

        //your code here

        //compare userMove and computerMove and print the result
        // three case may happen:
        // 1-the game was a tie if userMove and computerMove are the same
        // 2-you win
        // 3-computer wins
        //your code here
        if(userMove.equals(computerMove)){
            System.out.println("The game was a tie");
        } 
        
        else if (userMove.equals("rock")){
            if(computerMove.equals("paper")){
                System.out.println("Computer wins");
            } else {
                System.out.println("You win");
            }
        }

        else if (userMove.equals("paper")){
            if(computerMove.equals("scissors")){
                System.out.println("Computer wins");
            } else {
                System.out.println("You win");
            }
        }

        else if (userMove.equals("scissors")){
            if(computerMove.equals("rock")){
                System.out.println("Computer wins");
            } else {
                System.out.println("You win");
            }
        }

        else{
            System.out.println("Invalid move");
        }

        System.out.println("Computer move: " + computerMove);
        System.out.println("User move: " + userMove);
    }



}