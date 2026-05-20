package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.DatabaseRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.FileRepository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        repository.save();
    }
}
