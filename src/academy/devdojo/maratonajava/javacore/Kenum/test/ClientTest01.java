package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.Client.TypePayment;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Endo", TypeClient.NATURAL_PERSON, TypePayment.DEBITO);
        Client client2 = new Client("Gaveta", TypeClient.LEGAL_PERSON, TypePayment.CREDITO);
        System.out.println(client1);
        System.out.println(client2);
    }
}
