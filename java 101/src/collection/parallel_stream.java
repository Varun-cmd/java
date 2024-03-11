package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallel_stream {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(10000);
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            l1.add(rand.nextInt((100)));
        }

        long time1 = System.currentTimeMillis();


        int sum1 = l1.stream()
                .map(i->{
                    try {
                        Thread.sleep(1);
                    }catch (Exception ignored){}
                    return i*2;
                })
                .reduce(0,(c,e)->c+e);

        long time2 = System.currentTimeMillis();
        long timea =time2-time1;


        long times1 = System.currentTimeMillis();

        int sum2 = l1.parallelStream()
                .map(i->{
                    try {
                        Thread.sleep(1);
                    }catch (Exception ignored){}
                    return i*2;
                })
                .mapToInt(i->i) // converts to integers
                .sum();

        long times2 = System.currentTimeMillis();
        long timeb = times2-times1;



        System.out.println(sum1 +" "+sum2);
        System.out.println("Time 1 :"+timea+"\n"+"Time 2 :"+timeb );

        // parallel streams are much faster than normal streams




    }


}
