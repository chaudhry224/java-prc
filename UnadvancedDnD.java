//Week 4 Lab
// User controlled Loop
import java.util.Scanner;

public class UnadvancedDnD {
	public static void main(String[] args) {
        
        System.out.print("Please enter an action: ");
        
        Boolean z = true;
        while (z == true){
            Scanner sc = new Scanner(System.in);
            String c = sc.next();
        switch(c){
            case "x":  System.out.println("Bye!");
             z = false;
             break;
            case "u":  System.out.println("You go one square up.");
            System.out.print("Please enter an action: ");
            break;
            case "d":  System.out.println("You go one square down.");
            System.out.print("Please enter an action: ");
            break;
            case "l":  System.out.println("You go one square left.");
            System.out.print("Please enter an action: ");         
            break;
            case "r":  System.out.println("You go one square right.");
            System.out.print("Please enter an action: ");         
            break;
            case "s": System.out.println("You search the square for treasure. You find nothing.");
            System.out.print("Please enter an action: ");         
            break;
            case "h":  System.out.println("You hide, waiting for enemies to come by. It gets boring after about an hour and a half, so you give up.");
            System.out.print("Please enter an action: ");         
            break;
            case "e":  System.out.println("You eat some food. You regain 0 hit points.");
            System.out.print("Please enter an action: ");
                     break;
            default: System.out.println("I don't understand.");
            System.out.print("Please enter an action: ");;
                     break;
        }
        
    }


	}
}
