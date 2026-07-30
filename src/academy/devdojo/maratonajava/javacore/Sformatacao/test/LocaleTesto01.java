package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTesto01 {
    public static void main(String[] args) {
        //
        Locale locale1 = new Locale("it", "IT");
        Locale locale2 = new Locale("it", "CH");
        Locale locale3 = new Locale("hi", "IN");
        Locale locale4 = new Locale("ja", "JP");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,locale1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,locale2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,locale3);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,locale4);
        System.out.println("Italia " +df1.format(calendar.getTime()));
        System.out.println("Suiça " +df2.format(calendar.getTime()));
        System.out.println("India " +df3.format(calendar.getTime()));
        System.out.println("Japão " +df4.format(calendar.getTime()));

        System.out.println("---------");
        System.out.println(locale1.getDisplayLanguage(locale4));
        System.out.println(locale2.getDisplayCountry(locale4));
    }
}
