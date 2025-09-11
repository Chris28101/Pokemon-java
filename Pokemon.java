public class Pokemon {
    //instance vars
    String name;
    int health ;
    String type;
    int attack;
    int defence;
    int speed;
    int SpAttack;
    int SpDefence;
    //Defult constructor
    public Pokemon(){
        name = "";
        health = 0;
        type = "";
        attack = 0;
        defence= 0;
        speed = 0;
        SpAttack = 0;
        SpDefence = 0;
    }
    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
    }

}
