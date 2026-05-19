package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from the database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the database");
    }

    public static void retriveMaxDateSize() {
        System.out.println("Inside of retriveMaxDateSize in the class DataBaseLoader");
    }
}
