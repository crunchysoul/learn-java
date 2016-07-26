package guide.chapter03;

/**
 * Created by joshuazhao on 26/07/2016.
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // print the alphabet using a while loop
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
