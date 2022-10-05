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
      String name = scan.nextLine();
      show.println("Nice meet you"+name+"!");
      show.println( name+"Do you play whit me?");
      show.println("\nSelect one number.\n 1 -> YES 2 -> NOT");
      op = scan.nextInt();

      if(op == 2){
        show.println("SORRY, TRY AGAIN");
      }else if(op == 1){
        show.println("OK! THE RULES OF THE GAME");
        show.println("I choose a number between 0 and 10");
        show.println("But, i dont tell you what number i will chose");
        show.println("Try to guess the number. If you choose the correct number you are the winner");

        pc_choice = rand.nextInt(11);

        show.println("OKK!"+name+"I already chose");
        show.println("Now!Try to guess");

        do{
          user_choice = scan.nextInt();
          if(user_choice != pc_choice){
            show.println("wrong ansewr");
          }else{
            show.println("OMG!! IS CORRECT");
          }
        }while(pc_choice != user_choice);

      }

    }
  }