package factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        Scanner scanner = new Scanner(System.in);
        String enemyShipType = "";
        System.out.println("What type of ship? U / R / B");

        if(scanner.hasNextLine()) {
            enemyShipType = scanner.nextLine();
        }

        EnemyShip enemyShip = enemyShipFactory.makeEnemyShip(enemyShipType);
        if(enemyShip!=null)  doStuffEnemyShip(enemyShip);
        else System.out.println("Enter U | R | B");
    }

    public static void doStuffEnemyShip(EnemyShip enemyShip) {
        enemyShip.followHeroShip();
        enemyShip.displayEnemyShip();
        enemyShip.shootEnemyShip();
    }
}
