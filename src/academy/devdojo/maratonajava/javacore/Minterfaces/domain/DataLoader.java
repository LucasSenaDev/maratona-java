package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Doing permission checking");
    }
    public static void retriveMaxDateSize() {
        System.out.println("Inside of retriveMaxDateSize in the interface");
    }
}
