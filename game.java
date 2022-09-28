import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner; 


  public class game {
    public static void main(String []args){

      PrintStream show = System.out;
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();

      int op;
      int pc_choice;
      int user_choice;

      show.println("Hello, whats your name?");
      String nome = scan.nextLine();
      show.println("Nice meet you"+ nome+"!");
      show.println( nome+"Do you play whit me?");
      show.println("\nSelect one number.\n 1 -> 2 ");
      op = scan.nextInt();

      if(op == 2){
        show.println("SORRY, TRY AGAIN");
      }else if(op == 1){
        show.println("OK! THE RULES OF THE GAME");
        show.println("I choose a number between 0 and 10");
      }

    }
  }