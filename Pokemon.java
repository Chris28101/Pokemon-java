public class Pokemon {
    //instance vars
    int health ;
    String type;
    int attack;
    int defence;
    int speed;
    int SpAttack;
    int SpDefence;
    int level;
    String pokeName;
    int pokeBalls;
    boolean isBattling;

    //Default constructor
    public Pokemon(){
        health = 0;
        type = "";
        attack = 0;
        defence= 0;
        speed = 0;
        SpAttack = 0;
        SpDefence = 0;
        level = 1;
        pokeName = "";
        pokeBalls = 2;
        isBattling = false;


    }
    //parameter constructor
    public Pokemon(int health, String type,int speed, int attack , int defence , int SpAttack, int SpDefence, int level, String pokeName, int pokeBalls, boolean isBattling){
        this.health = health;
        this.type = type;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.SpDefence = SpDefence;
        this.SpAttack = SpAttack;
        this.level = level;
        this.pokeName = pokeName;
        this.pokeBalls = pokeBalls;
        this.isBattling = isBattling;

    }
    //getters and setters

    public void setType(String Type) {
        type = Type;
    }
    public String getType(){
        return type;
    }
    public void setHealth(int Health){
        health = Health;
    }
    public int getHealth(){
       return health;
    }

    public void setAttack(int Attack) {
        attack = Attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setDefence(int Defence) {
        defence = Defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setSpeed(int Speed) {
        speed = Speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLevel(int level1) {
        level = level1;
    }

    public int getLevel() {
        return level;
    }

    public void setSpAttack(int spAttack) {
        SpAttack = spAttack;
    }

    public int getSpAttack() {
        return SpAttack;
    }

    public void setSpDefence(int spDefence) {
        SpDefence = spDefence;
    }

    public int getSpDefence() {
        return SpDefence;
    }

    public void setPokeName(String PokeName) {
        pokeName = PokeName;
    }

    public String getPokeName() {
        return pokeName;
    }

    public void setPokeBalls(int PokeBalls) {
        pokeBalls = PokeBalls;
    }

    public int getPokeBalls() {
        return pokeBalls;
    }

    public void setBattling(boolean battling) {
        isBattling = battling;
    }

    public boolean isBattling() {
        return isBattling;
    }

    //methods
    public void Battle(){
        if (isBattling == true){

        }
    }
    public void attack(){

    }

}
