package factory;

import java.util.Scanner;

/**
 * Created by vn0dht3 on 1/15/17.
 */

// demonstrates why the factory pattern is used
// user can pick there ship at run time
public class EnemyShipTesting {

    public static void main(String[] args) {
//          old method
//        EnemyShip ufoShip= new UFOEnemyShip();
//        dostuff(ufoShip);

        EnemyShip enemyShip= null;


        EnemyShipFactory enemyShipFactory= new EnemyShipFactory();

        System.out.println("Enter the enemy ship you want to create U/B/R");

        Scanner scanner= new Scanner(System.in);

        if (scanner.hasNextLine()){
            enemyShip=enemyShipFactory.makeEnemyShip(scanner.nextLine());
        }

        if(enemyShip!=null){
            dostuff(enemyShip);
        }else System.out.println("Enter the following choices next time U/B/R");
    }
    public  static void dostuff(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
