import java.util.Scanner;
import java.lang.Thread;
public class main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("              _                              \n" +
                "  _ __   ___ | | _____ _ __ ___   ___  _ __  \n" +
                " | '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ \n" +
                " | |_) | (_) |   <  __/ | | | | | (_) | | | |\n" +
                " | .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|\n" +
                " |_|                                         ");
        boolean game_loop = true;
        while(game_loop){
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Proffesor rowan: Welcome " + name + "to the Sinnoh region!" );
        Thread.sleep(2000);
        System.out.println("You can choose from 3 starter pokemon from this region");
        Thread.sleep(2000);
        System.out.println("1.Chimchar the fire type ");
    }
}
