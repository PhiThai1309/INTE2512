package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numeric = {4, 3, 7, 23, 193, 28, 42, 443, 532, 3345};
        String[] str = {"b", "e", "w", "s", "t", "u"};
        Arrays.sort(numeric);
        Arrays.sort(str);
        System.out.println("Sorted numeric array: " + Arrays.toString(numeric));
        System.out.println("Sorted string array: " + Arrays.toString(str));
    }
}
