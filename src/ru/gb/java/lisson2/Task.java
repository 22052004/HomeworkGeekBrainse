package ru.gb.java.lisson2;

public class Task {
    public static void main(String[] args) {
        System.out.print(invertArray());
        System.out.print(fillArray());
        System.out.println(changeArray());
        System.out.println(fillDiagonal());
        System.out.println(MinimumAndMaximum());
        System.out.println();
    }
    public static char[] invertArray() {
        System.out.println("Задание 1.");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }
        return new char[0];
    }

    public static char[] fillArray() {
        System.out.println("Задание 2.");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");
        return new char[0];
    }

    public static char[] changeArray() {
        System.out.println("Задание 3.");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
        return new char[0];
    }

    public static char[] fillDiagonal() {
        System.out.println("Задание 4.");
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        return new char[0];
    }

    public static char[] MinimumAndMaximum() {
        System.out.println("Задание 5.");
        int[] arr5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0], max = arr5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                indMax = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);


        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("задание 6., результат = " + checkBalance(arr6));

        System.out.println("\r\n7 - задание +3 сдвига");
        shiftOfNumbers(arr6, 3);

        System.out.println("\r\n7 - задание -3 сдвига");
        shiftOfNumbers(arr6, -3);


        return new char[0];
    }

    private static void fillSnake(int i, int i1) {
    }

    private static boolean checkBalance(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }

    private static void shiftOfNumbers(int[] arrParam, int n) {
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("Задание 7.");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
                for (int i : arrParam) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length - 1] = buf;
                for (int i : arrParam) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }


    }
}

