package mate.academy.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>(1_000_000);

        long llStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add(0, i);
        }
        long llEnd = System.currentTimeMillis();
        System.out.println("LL " + (llEnd - llStart));


        long alStart = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            al.add(0, i);
        }
        long alEnd = System.currentTimeMillis();

        System.out.println("AL " + (alEnd - alStart));
    }
}

