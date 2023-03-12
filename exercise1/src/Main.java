import java.util.*;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        //sortArrayByFrequency(arr);
        //System.out.println(Arrays.toString(arr));

        //int[] arr2 = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        //sortArrayByFrequency(arr2);
        //System.out.println(Arrays.toString(arr2));

        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        //int[] arr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(countMap.keySet());
        list.sort((num1, num2) -> {
            int count1 = countMap.get(num1);
            int count2 = countMap.get(num2);

            if (count1 == count2) {
                return Integer.compare(indexOf(arr, num1), indexOf(arr, num2));
            }
            return Integer.compare(count2, count1);
        });

        int[] result = new int[arr.length];
        int index = 0;
        for (int num : list) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                result[index++] = num;
            }
        }

        System.out.println(Arrays.toString(result));
    }

    // Helper method to find the index of an element in an array.
    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}