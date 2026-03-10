package academy.devdojo.maratonajava.introducao;

import java.util.Locale;

public class Aula05EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double anualSalary = 75000.0;
        double tax;
        double taxValue;
         if(anualSalary <= 34712) {
            tax = 9.70 / 100;
        } else if(anualSalary >= 34713 && anualSalary <= 68507) {
            tax = 37.35 / 100;
        } else {
            tax = 49.50 / 100;
        }
         taxValue = anualSalary * tax;
        System.out.printf("Tax: %.2f", taxValue);
    }
}
