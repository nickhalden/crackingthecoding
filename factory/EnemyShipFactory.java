package factory;

/**
 * Created by vn0dht3 on 1/15/17.
 */

// provides the logic for creating and
// making the type of enemy ship
// logic shifts from
public class EnemyShipFactory {


    public EnemyShip makeEnemyShip(String input){
        EnemyShip enemyShip=null;

        if(input.equals("U")){ // gives back the ufo ship
                return new UFOEnemyShip();
            }else  if(input.equals("R")){ // gives back the rocket ship
                return  new RocketEnemyShip();
            } else  if(input.equals("B")) { // gives back the big ufo ship
                return new BigUFOEnemyShip();
            }
            else  return null;
    }

}
