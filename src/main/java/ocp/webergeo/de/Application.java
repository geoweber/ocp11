package ocp.webergeo.de;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());

        Function<Double, String> first = a->a.toString();
        //String - result type after Function
        Function<String, Integer> second = s ->  (int)+ Double.parseDouble(s);

        Function<Double, Integer> compose = second.compose(first);
        // first V,T second T,R,
        System.out.println("compose  - "+ compose.apply(Double.valueOf("111.11")));

        Function<Double, Integer> andThat = first.andThen(second);

        System.out.println("andThat  - "+ andThat.apply(Double.valueOf("111.11")));

        System.out.println("identity  - "+ Function.identity());

        //Function<String, String> quotAandThen = quote.andThen(quote);

        // String - result type after Function
        //V -int
        // result string


     //   System.out.println("quoteIntToString - "+ quoteCompose.apply(111));
      //  System.out.println("quoteIntToString - "+ quotAandThen.apply(111));
      //  assertEquals("'5'", quoteIntToString.apply(5));
    }
}
