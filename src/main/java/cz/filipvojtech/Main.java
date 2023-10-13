package cz.filipvojtech;

import java.util.Arrays;

import static cz.filipvojtech.util.Array.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello mum!");

//        int[] arr = new int[]{1, 2, 3};
//        int max = findMax(arr);
//        System.out.println(max);
//
//        Float[] arr2 = new Float[]{20.91f, -2.3f, 9.1f};
//        float max2 = findMax(arr2);
//        System.out.println(max2);

//        var str = new String[]{"1", "2", "3", "4"};
//        System.out.println(str.length);
//        var bigString = growArray(str);
//        System.out.println(bigString.length);

//        var decimal = new Float[]{1.3f, 2.6f, 3.9f, 4.12f, 5.15f};
//        System.out.println(decimal.length);
//        var decimalBig = growArray(decimal);
//        System.out.println(decimalBig.length);

//        int[] one = new int[]{0, 1, 2};
//        int[] two = new int[]{3, 4, 5};
//        int[] three = new int[]{6, 7, 8, 9};
//        var comb1 = merge(one, two);
//        var comb2 = merge(two, three);
//        System.out.println(Arrays.toString(comb1));
//        System.out.println(Arrays.toString(comb2));

//        int[] four = new int[]{5, 12, 33, 42};
//        int[] five = new int[]{1, 9, 55};
//        var mergedOrdered = mergeOrdered(four, five);
//        System.out.println(Arrays.toString(mergedOrdered));

        var first = new String[]{"O", "Thr", "Exact", "Very long string"};
        var second = new String[]{"", "Four", "Exact", "Even longer string"};
        var mergeOrdered = mergeOrdered(first, second);
        System.out.println(Arrays.toString(mergeOrdered));
    }
}
