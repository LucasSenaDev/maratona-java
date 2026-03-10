package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        for(int i=0;i<=1000000; i++) {
            int testingNumber = i % 2;
            if(testingNumber == 0) {
                System.out.println("Even Number: " + i);
            }
        }
    }
}
