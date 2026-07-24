package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "lucas Teixeira";
        nome.concat(" Soares");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("lucas Teixeira"); // padrão 16
        sb.append(" Soares").append(" Sena");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
