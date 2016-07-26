package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); //get a char
        } while (ch != 'q');
    }
}
