package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Endo", TypeClient.NATURAL_PERSON);
        Client client2 = new Client("Endo", TypeClient.LEGAL_PERSON);
        Client client3 = new Client("Endo", TypeClient.NATURAL_PERSON);
        Client client4 = new Client("Endo", TypeClient.LEGAL_PERSON);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}
