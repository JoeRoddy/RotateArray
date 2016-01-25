package Array;

import java.util.ArrayList;

/**
 * Created by Joe on 1/25/16.
 */
public class App {
    public static void main(String[] args) {
        RotateArray testArray = new RotateArray();
        testArray.add("a"); testArray.add("b"); testArray.add("c");
        testArray.add("d"); testArray.add("e"); testArray.add("f");
        testArray.rotate(3);
        System.out.println(testArray.toString());
    }
}
