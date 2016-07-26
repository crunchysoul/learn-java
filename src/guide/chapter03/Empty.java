package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class Empty {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
