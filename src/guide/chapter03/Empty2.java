package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // move initialization out of loop
        for (; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
