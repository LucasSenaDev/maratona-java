package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double totalValue = 30000.0;
        for (int installment = (int) totalValue; installment >= 1; installment--) {
            double intallmentValue = totalValue / installment;
            if(intallmentValue <1000) {
                continue;
            }
            System.out.println("Installment " + installment + " R$ " + intallmentValue);
        }
    }
}
