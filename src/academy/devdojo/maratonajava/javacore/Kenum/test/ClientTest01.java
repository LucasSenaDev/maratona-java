package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypePayment;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Endo", TypeClient.NATURAL_PERSON, TypePayment.DEBIT);
        Client client2 = new Client("Gaveta", TypeClient.LEGAL_PERSON, TypePayment.CREDIT);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(TypePayment.DEBIT.calculateDiscount(100));
        System.out.println(TypePayment.CREDIT.calculateDiscount(100));
        TypeClient typeClient = TypeClient.valueOf("NATURAL_PERSON");
        System.out.println(typeClient);
        TypeClient typeClient2 = TypeClient.typeClientforRelatoryName("Natural Person");
        System.out.println(typeClient2);

    }
}
