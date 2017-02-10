package factory;

/**
 * Created by vn0dht3 on 1/15/17.
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    // all the enemy ships would have the following methods

    public void followHeroShip(){
        System.out.println(getName()+" following the hero");

    }
    public void displayEnemyShip(){
        System.out.println(getName()+"is on screen");

    }
    public void enemyShipShoots(){
        System.out.println(getName()+" attacks an enemy and does "+ getAmtDamage());
    }


}
