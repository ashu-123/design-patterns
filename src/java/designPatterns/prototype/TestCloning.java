package prototype;

public class TestCloning {

    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) cloneFactory.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println(sally.hashCode());
        System.out.println(clonedSheep.hashCode());
    }
}
