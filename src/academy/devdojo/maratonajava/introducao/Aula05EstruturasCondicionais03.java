package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 3000.0;
        //(condition) ? true : false;
        System.out.println(salary > 5000.0 ? "I gonna donate 500 to DevDojo" : "I dont  enough money to donate");
        int age = 15;
        String category;
        category = age < 15 ? "Children's Category" : age >= 15 && age < 18 ? "Juvenile Category" : "Adult Category";
    }
}
