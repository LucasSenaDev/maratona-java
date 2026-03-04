package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBedida = age >= 18;
        if(isAutorizadoComprarBedida != false) {
            System.out.println("Autorizado a comprar bebidas alcóicas");
        } else {
            System.out.println("Não autorizado a comprar bebidas alcólicas");;

        }

        if(!isAutorizadoComprarBedida) {
            System.out.println("Não autorizado a comprar bebidas alcólicas");;
        }

        boolean c = true;
        if(c == false) {
            System.out.println("Dentro de algo que não deveria existir");;
        }

        System.out.println("Fora do if");

    }
}
