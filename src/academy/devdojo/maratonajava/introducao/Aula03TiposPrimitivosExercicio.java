package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
/*
Prático

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

Eu <nome>, morando no endereço <endereço>>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name = "Lucas";
        String address = "Rua das carmelitas";
        double salary = 1900.0;
        String receivingDate = "28 de fevereiro";

        System.out.println("Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de " + salary + ", na data " + receivingDate);
        System.out.printf("Eu %s, morando no endereço %s,%nconfirmo que recebi o salário de %.2f, na data %s", name, address, salary, receivingDate);
    }
}
