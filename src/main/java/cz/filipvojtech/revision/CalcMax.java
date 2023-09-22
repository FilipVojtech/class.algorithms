package cz.filipvojtech.revision;

public class CalcMax {

    public static int findMax(int num1, int num2, int num3) {
        int max = Integer.MIN_VALUE;

        if (num1 > max)
            max = num1;

        if (num2 > max)
            max = num2;

        if (num3 > max)
            max = num3;

        return max;
    }

    public static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max)
                max = num;
        }

        return max;
    }
}
