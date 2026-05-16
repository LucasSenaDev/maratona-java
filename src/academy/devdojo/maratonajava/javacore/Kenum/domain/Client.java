package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Client {
    public enum TypePayment {
        DEBITO,
        CREDITO
    }
    private String name;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String name, TypeClient typeClient, TypePayment typePayment) {
        this.name = name;
        this.typeClient = typeClient;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                ", typeClientInt=" + typeClient.getValue() +
                ", typePayment=" + typePayment +
                '}';
    }
}
