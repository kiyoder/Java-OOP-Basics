package Characters;

public class CharacterMain {
    public static void main(String[] args) {
        Character Kiyo = new Character(50,20, 30);
        System.out.println("Default Health: " + Kiyo.getHealth());
        System.out.println("Default Damage: " + Kiyo.getDamage());
        System.out.println("Default Shield: " + Kiyo.getShield());
        Kiyo.setHealth(100);
        System.out.println("New Health: " + Kiyo.getHealth());
        System.out.println("Receive 50 Damage! ");
        Kiyo.receiveDamage(130);
        System.out.println("New Health: " + Kiyo.getHealth());

        Swordsman Paul = new Swordsman();
        System.out.println("H: " + Paul.getHealth() + " D: " + Paul.getDamage() + " S: " + Paul.getShield());

        Paladin Sasha = new Paladin();
        System.out.println("H: " + Sasha.getHealth() + " D: " + Sasha.getDamage() + " S: " + Sasha.getShield());

        Sasha.receiveDamage(119);
        System.out.println("Paladin Sasha Health: " + Sasha.getHealth());
        Sasha.receiveDamage(119);
        System.out.println("Paladin Sasha Health: " + Sasha.getHealth());

    }
}
