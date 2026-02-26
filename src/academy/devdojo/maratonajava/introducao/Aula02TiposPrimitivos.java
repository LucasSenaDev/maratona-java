package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long bigNmber = 100000L;
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean isTrue = true;
        boolean isFalse = false;
        char caracter = '\u0041';

        String name = "Goku";

        System.out.println("A idade é " + name + " anos");
        System.out.println(isFalse);
        System.out.println("char " + caracter);
        System.out.println(age);
        System.out.println("Hi, my name is " + name);

    }
}
