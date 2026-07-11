package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo o documento");
            System.out.println("Reescrevendo o documento");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2(){
        try{
            System.out.println("Abrindo o documento");
            System.out.println("Reescrevendo o documento");
            throw  new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
