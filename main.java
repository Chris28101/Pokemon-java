import java.security.Key;
import java.util.Scanner;
import java.lang.Thread;

import java.util.Enumeration;
public class main {
    public static void main(String[] args) throws InterruptedException {
        Pokemon poke = new Pokemon();
        Pokemon enemy = new Pokemon();
        Player player = new Player();

        Scanner scan = new Scanner(System.in);
        System.out.println("              _                              \n" +
                "  _ __   ___ | | _____ _ __ ___   ___  _ __  \n" +
                " | '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ \n" +
                " | |_) | (_) |   <  __/ | | | | | (_) | | | |\n" +
                " | .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|\n" +
                " |_|                                         ");
        boolean game_loop = true;
        while (game_loop) {
            System.out.println("Enter your name: ");
            String name = scan.nextLine();
            System.out.println("Proffesor rowan: Welcome " + name + " to the Sinnoh region!");
            Thread.sleep(2000);
            System.out.println("You can choose from 3 starter pokemon from this region");
            Thread.sleep(2000);
            System.out.println("C.Chimchar the fire type");
            Thread.sleep(2000);
            System.out.println("P.Piplup the water type");
            Thread.sleep(2000);
            System.out.println("T.Turtwig the grass type");
            Thread.sleep(2000);
            System.out.println("So which pokemon would you like to pick (T, P or C?): ");
            String pname = scan.nextLine().toUpperCase();
            if (pname.equals("C")) {
                poke.setPokeName("Chimchar");
                poke.setHealth(45);
            }
            if(pname.equals("P")) {
                poke.setPokeName("Piplup");
                poke.setHealth(50);
            }
            if (pname.equals("T")) {
                poke.setHealth(55);
                poke.setPokeName("Turtwig");
            }
            player.caughtPokemon.add(poke);
            System.out.println("Excellent choice your pokemon is " + poke.getPokeName() + " I hope you guys can have great adventures together");
            Thread.sleep(2000);
            System.out.println("Before I send you out im giving you " + player.getPokeBalls() + " Pokeballs");
            Thread.sleep(2000);
            System.out.println("After you defeat a wild pokemon you can have a chance at catching the pokemon by throwing the pokeball at the pokemon");
            Thread.sleep(2000);
            System.out.println("Its a 50/50 chance you get it so if you dont you can keep trying with as many pokeballs you have or just leave it alone!");
            System.out.println("Enough yapping go enjoy your journey ill see you soon!");
            System.out.println("*You go down route 201 and encounter a wild Starly a Normal flying type pokemon");
            System.out.println("Would you like to battle this pokemon? y/n: ");
            String battle = scan.nextLine();
            if(battle.equals("y")){
                System.out.println(poke.getPokeName() + poke.getLevel() + poke.getHealth());
                Thread.sleep(2000);
                //giving enemy attributes
                enemy.setHealth(35); enemy.setPokeName("Starly"); enemy.setLevel(1);

                System.out.println(enemy.getPokeName() + enemy.getLevel() + enemy.getHealth());
                while (poke.health > 0) {
                    System.out.println("What move do you want to do?: ");
                    poke.doMove();
                    String nMove_Choice = scan.nextLine();
                    System.out.println("You used " + nMove_Choice);
                    poke.Attack(enemy,nMove_Choice);

                    System.out.println(enemy.getPokeName() + enemy.getHealth());


                    System.out.println(enemy.getPokeName() + " Used pound");
                    enemy.Attack(poke, "Pound");
                    System.out.println("Your hp is " + poke.getHealth());


                    if (enemy.health<=0){
                        System.out.println(enemy.getPokeName()+ " fainted...");

                        game_loop = false;
                    }
                    if (poke.health <= 0 ){
                        game_loop = false;
                    }
                }

                System.out.println("You defeated " + enemy.getPokeName()+ " would you like to try to catch " + poke.getPokeName() );
                System.out.println("y or n?");
                String caught = scan.nextLine();
                while(player.pokeBalls > 0) {
                    if (caught.equals("y")) {
                        player.catchEm(enemy);
                    }
                    System.out.println("you have " +  player.pokeBalls + " left do you want to go again (y/n)");
                    String try = scan.b
                }







            }





        }
    }
}
