package singleton;

public class ScrabbleTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Instance ID: " + singleton.hashCode());
        System.out.println(singleton.getLetters());
        System.out.println("Player 1: " + singleton.getTiles(7));
        System.out.println(singleton.getLetters());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + singleton2.hashCode());
        System.out.println(singleton2.getLetters());
        System.out.println("Player 2: " + singleton2.getTiles(7));
        System.out.println(singleton2.getLetters());


    }
}
