package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores Aritméticos
        // + - / *
        int number1 = 10;
        int number2 = 20;
        double result = (double) number1 / number2;
        System.out.println(result);

        //Operadores Relacionais
        // % = resto
        int rest = 21 % 7;
        System.out.println(rest);

        // retornam valores booleanos (verdadeiro ou falso)
        // <(menor)    >(maior) <=(menor igua) >=(maior igual) ==(igual) !=(diferente)
        boolean isTenHigherThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenequalTwenty = 10 == 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDiferentThanTen = 10 != 10;
        boolean isTenDiferentThanTwenty = 10 != 20;
        System.out.println("IsTenHigherThanTwenty " + isTenHigherThanTwenty);
        System.out.println("IsTenSmallerThanTwenty " + isTenSmallerThanTwenty);
        System.out.println("IsTenEqualTwenty " + isTenequalTwenty);
        System.out.println("IsTenEqualTen " + isTenEqualTen);
        System.out.println("isTenDiferentThanTen " + isTenDiferentThanTen);
        System.out.println("isTenDiferentThanTwenty " + isTenDiferentThanTwenty);

        // Operadores Lógicos
        // && (AND) || (OR) !(NOT)
        int age = 29;
        float salary = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = age >= 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age <= 30 && salary >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        // (OR)
        double totalValueBankAccount1 = 200.0;
        double totalValueBankAccount2 = 10000.0;
        float playstationValue = 5000f;
        boolean isPlaystationPurchasable = totalValueBankAccount1 > playstationValue || totalValueBankAccount2 > playstationValue;
        System.out.println("isPlaystationPurchasable " + isPlaystationPurchasable);

        //Operadores de Atribuição
        // = += -= *= /= %=
        double bonus = 1800.0; // 1800.0
        bonus += 1000.0; // 2800.0
        bonus -= 1000.0; // 1800.0
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int count = 0;
        count += 1 ;// cout = count + 1;
        count++;
        count--;
        ++count;
        --count;
        int count2 = 0;
        System.out.println(count);
        System.out.println("count2 " + count2++);
        System.out.println("count2 " + count2);

    }
}
