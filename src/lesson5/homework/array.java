package lesson5.homework;

public class array {

    public static void array1() {
        final int SIZE = 10000000;
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) arr[i] = 1;
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

    }

    public static void array2() {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) arr[i] = 1;
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        long a = System.currentTimeMillis();
        class RunnableA1 implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < SIZE; i++) {
                    a1[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }
        class RunnableA2 implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < SIZE; i++) {
                    a2[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        }
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }
        public static void main(String[] args) {
        array1();
        array2();
    }
}


