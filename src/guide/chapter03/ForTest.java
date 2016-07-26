package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {

        int i;

        System.out.println("Press S to stop.");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);
    }
}
