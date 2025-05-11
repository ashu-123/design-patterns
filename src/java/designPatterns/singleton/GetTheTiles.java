package singleton;

public class GetTheTiles implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(singleton));
        System.out.println(singleton.getLetters());
        System.out.println("Player : " + singleton.getTiles(7));
        System.out.println("Got tiles");
    }
}
