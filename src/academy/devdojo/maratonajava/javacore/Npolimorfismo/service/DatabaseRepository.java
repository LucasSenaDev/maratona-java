package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in a database");
    }
}
