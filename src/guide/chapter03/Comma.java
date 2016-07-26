package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i=0, j=10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}
