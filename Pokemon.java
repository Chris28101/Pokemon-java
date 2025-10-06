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
    int level;
    //Default constructor
    public Pokemon(){
        name = "";
        health = 0;
        type = "";
        attack = 0;
        defence= 0;
        speed = 0;
        SpAttack = 0;
        SpDefence = 0;
        level = 1;
    }
    //parameter constructor
    public Pokemon(String name, int health, String type,int speed, int attack , int defence , int SpAttack, int SpDefence, int level){
        this.name = name;
        this.health = health;
        this.type = type;
        this.speed = speed;
        this.attack = attack;
        this.defence = defence;
        this.SpDefence = SpDefence;
        this.SpAttack = SpAttack;
        this.level = level;

    }
    //getters and setters
    public void setName(String Name) {
        name = Name;
    }

    public String getName() {
        return name;
    }

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

}
