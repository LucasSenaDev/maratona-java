package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte short int long = 0
        // char '\u0000' ' '
        // boolean 'false'
        // String null

        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Gon";
        names[2] = "Subaru";
        names[3] = "ichigo";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
