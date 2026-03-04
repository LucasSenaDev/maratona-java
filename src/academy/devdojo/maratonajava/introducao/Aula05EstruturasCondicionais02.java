package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 = categoria infantil
        // idade entre 15 e 18 = categoria juvenil
        // idade acima de 18 = categoria adulta
        int age = 16;
        String category;
        if(age < 15) {
            category = "Children's Category";
        } else if(age >= 15 && age < 18) {
            category = "Juvenile Category";
        } else {
            category = "Adult Category";
        }
        System.out.println(category);
    }
}
