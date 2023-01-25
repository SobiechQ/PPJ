package W14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        {
            String str = "(l123ab";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("123");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find()+", poniewż w stringu str występuje 123"); //true
        }
        {
            String str = "1335ab";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("1[0123][0-9]");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find()+", poniewż w stringu str występuje 1ab gdzie a to {0;1;2;3} oraz b to <0,9>"); //true
        }
        {
            String str = "137";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("1[0123]\\d");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find()+", poniewż w stringu str występuje 1ab gdzie a to {0;1;2;3} oraz b to <0,9> tylko innym zapisem w kodzie"); //true
        }
        {
            String str = "6";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("[0-9&&[^6]]");//[^26] -> nie 2 i nie 6.
            pattern = Pattern.compile("[0-57-9]"); //ten sam zapis
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find()+", ponieważ 6 nie jest w dziedzinie"); //false
        }
        {
            String str = "137";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("\\d{4}");
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find()+", poniewż są tylko 3 cyfry zamiast 4"); //false
        }
        {
            String str = "1374";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("\\d{4}"); //{3,9} -> od 3 do 9 cyfr.  {0,} -> 0 lub więcej razy (inna forma to *). {1,} (inna forma +). {0,1} (inna forma ?).   znak . pozwala dać dowolny znak (chyba)
            Matcher matcher = pattern.matcher(str);
//            System.out.println(matcher.find()+", poniewż są tylko 4 cufry"); //true
            while (matcher.find())
                System.out.println(matcher.group() + "rtue pojawiło się raz i zostało wypisane.");
        }
        {
            String str = "(1375) - opis1\n" +
                    "(2137) - opis2\n" +
                    "(6969) - smizene\n";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("[(](\\d{4})[)] - (\\w+)"); // $ oznacza koniec linii.
            Matcher matcher = pattern.matcher(str);
            while (matcher.find())
                System.out.println(matcher.group(2) + ". Wypisuje razem z nawiasami"); //grupa druga, czyli same \\w+
        }
        {
            String str = "1372abc456def";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("\\D"); //to co nie jest cyfrą.
            Matcher matcher = pattern.matcher(str);
            while (matcher.find())
                System.out.print(matcher.group());
        }
        {
            String str = "1372abc456def";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("\\D"); //to co nie jest cyfrą.
            Matcher matcher = pattern.matcher(str);
            while (matcher.find())
                System.out.print(matcher.group());
        }
        {
            System.out.println(" ");
            System.out.println(" ====== ");
            String str = "raz:";
            //wyrażenie regularne
            Pattern pattern = Pattern.compile("([\\w*])[:]]"); //to co nie jest cyfrą.
            Matcher matcher = pattern.matcher(str);
            while (matcher.find())
                System.out.print(matcher.group(1));
        }
    }
}
