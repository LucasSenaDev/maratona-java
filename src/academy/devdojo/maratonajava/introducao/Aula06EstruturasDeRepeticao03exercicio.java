package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03exercicio {
    public static void main(String[] args) {
        double carValue = 40000;
        for (int installment = 1; installment<=carValue; installment++) {
            double installmentValue = carValue / installment;
            if(installmentValue < 1000) {
                break;
            }
                System.out.println("Installment: " + installment + " R$ " + installmentValue);
        }
    }
}
