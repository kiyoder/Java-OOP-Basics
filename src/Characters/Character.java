package Characters;

public class Character {
    private int health;
    private int damage;
    private int shield;

    public Character(int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getShield(){
        return this.shield;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void receiveDamage(int damage){
        int actualDamage = Math.abs(this.shield - damage);

        this.health -= actualDamage;

        if(this.health <= 0){
            System.out.println("Character has died");
            this.health = 0;
        }
    }
}
