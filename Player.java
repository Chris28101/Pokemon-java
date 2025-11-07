import java.util.Random;
import java.util.ArrayList;
public class Player {
    //Instance vars
    int pokeBalls;
    ArrayList<Pokemon> caughtPokemon = new ArrayList<Pokemon>();
    //Creating random object
    Random rand = new Random();

    //default constructor
    public Player(){
        pokeBalls = 2;
    }

    //parameter constructor
    public Player(int pokeBalls){
        this.pokeBalls = pokeBalls;
    }
    // getters and setters
    public void setPokeBalls(int PokeBalls) {
        pokeBalls = PokeBalls;
    }

    public int getPokeBalls() {
        return pokeBalls;
    }

    //Methods
    public boolean catchEm(Pokemon target){
        int randChoice = rand.nextInt(1,pokeBalls +1);
        if (pokeBalls <= 0) {
            System.out.println("You have no Pokéballs left!");
            return false;
        }
        System.out.println("You throw a pokeball and cross your fingers...");
        pokeBalls-=1;
        if (randChoice == 1) {
            caughtPokemon.add(target);
            System.out.println("You caught " + target.getPokeName() + "!");
            return true;
        } else {
            System.out.println(target.getPokeName() + " broke free!");
            return false;
        }
    }
}
