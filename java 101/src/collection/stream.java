package collection;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
        List<Integer> l1 =  Arrays.asList(2, 4,11,13,7,3, 6, 8, 10);
        Stream<Integer> vals = l1.stream(); // values of l1 are copied to the vals object


       // vals.forEach(System.out::println);// this stream can be used only once.
        Stream<Integer> s1 = vals.filter(n ->n%2==0);
        Stream<Integer> s2 = s1.map(n -> n*2);
        List<Integer> latest= s2.toList();
        System.out.println(latest);

        // more efficient way:
        int res = l1.stream()
                .filter(n-> n%2==0)
                .map(n ->n*2)
                .reduce(0,(c,e)->c+e);


        System.out.println("result: "+res);

        Stream<Integer> sorted = l1.stream()
                .filter(n -> n%2==0)
                .sorted();
        System.out.println("Sorted values:");
        sorted.forEach(System.out::print);










        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        };








    }

}
