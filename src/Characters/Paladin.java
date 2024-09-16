package Characters;

public class Paladin extends Swordsman{

    boolean hasResurrected;

    public Paladin(){
        super();
        this.hasResurrected = false;
    }

    @Override
    public void receiveDamage(int damage) {
        int actualDamage = 0;

        if(damage % 2 == 0){
            actualDamage = damage / 2;
        }
        else{
            actualDamage = damage;
        }

        this.setHealth(this.getDamage()-actualDamage);

        if(this.getHealth() <= 0){
            resurrect();
        }
    }

    public void resurrect(){
        if(this.hasResurrected == false){
            this.hasResurrected = true;
            this.setHealth(100);
        }
        else{
            this.setHealth(0);
            System.out.println("Paladin has died");
        }


    }


}
