package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 12;
        while(count < 10){
            System.out.println(++count);
        }
        count = 0;
      //  do{
      //      System.out.println("Dentro do do-while " + ++count);
      //  } while(count < 10);

        for(int i=1;i<=10;i++){
            System.out.println("for " + i);
        }
    }
}
