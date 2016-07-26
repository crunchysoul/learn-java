package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class ContDemo {
    public static void main(String[] args) {
        int i;

        //print even numbers between 0 and 100
        for (i=0; i<=100; i++) {
            if ((i%2) != 0) continue; //iterate
            System.out.println(i);
        }
    }
}
