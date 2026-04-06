package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03exercicio {
    public static void main(String[] args) {
       double carValue = 40000;
       double result;
       for(int i = 1; i < carValue; i++) {
           result = carValue / i;
           if(result < 1000) {
               break;
           }
           System.out.printf("parcela: %d, valor: %.2f%n", i, result);

           System.out.println("fora do if");

       }
    }
}
