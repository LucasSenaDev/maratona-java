package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionaisExercicio02 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte day = 7;
        switch (day) {
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
                System.out.println("Working day");
                break;
            case 3:
                System.out.println("Working day");
                break;
            case 4:
                System.out.println("Working day");
                break;
            case 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Working day");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
