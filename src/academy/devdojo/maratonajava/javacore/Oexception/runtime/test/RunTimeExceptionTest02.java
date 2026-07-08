package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código encerrado");
    }

    /**
     *
     * @param a
     * @param b o divisor não pode ser zero
     * @return
     * @throws IllegalArgumentException se caso o arg b for zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return a/b;
    }
}
