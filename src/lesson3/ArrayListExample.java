package lesson3;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
//        arrayExample();
        arrayListExample();
//        arrayListToArray();
    }

    private static void arrayExample() {
        Integer[] arr = new Integer[4];//+5
//        int[] arr = {1, 2, 3, 4};
//        int[] arrNew = new int[10];
//        System.arraycopy(arr, 0, arrNew, 0, arr.length);
        Integer[] arrNew = Arrays.copyOf(arr, 10);
        arr = arrNew;
        arr[4] = 5;
//        arrNew = null;
    }

    private static void arrayListToArray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addAll(List.of(1, 2));
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        List<Integer> arr2 = Arrays.asList(arr);
//        List<Integer> arr3 = new ArrayList(arr);
//        arr = list.toArray(new Integer[0]);
    }

    private static void arrayListExample() {
        LinkedList<String> newDataName = new LinkedList<>();
        newDataName.add("B");
        newDataName.add("A");
//        newDataName.add(1);
        newDataName.add("C");
        newDataName.add("E");
        newDataName.add("D");
        newDataName.add("E");
        newDataName.add("E");
//        newDataName.sort();
//        newDataName.trimToSize();
        System.out.println(newDataName);
        newDataName.add(1, "А0");
        System.out.println(newDataName);
        newDataName.remove("E");
        newDataName.remove(2);
        System.out.println(newDataName);
        System.out.println("contains C? " + newDataName.contains("C"));

        for (int i = 0; i < newDataName.size(); i++) {
            System.out.println(newDataName.get(i));//newDataName[i]
        }


        for (String next : newDataName) {
            System.out.println(next);
        }

        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.remove(1);
        System.out.println(data);

        data.sort(Comparator.naturalOrder());

//        List<String> anotherData = new ArrayList<>(newDataName);
        List<String> anotherData = new ArrayList<>(5);
    }

}
