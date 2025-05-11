package factory;

import java.util.Scanner;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String enemyShipType) {

        EnemyShip enemyShip = null;
        if(enemyShipType.equals("U")) enemyShip = new UFOEnemyShip();
        else if(enemyShipType.equals("R")) enemyShip = new RocketEnemyShip();
        else if(enemyShipType.equals("B")) enemyShip = new BigUFOEnemyShip();

        return enemyShip;
    }
}
