package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read(); // get a char
            if (ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}