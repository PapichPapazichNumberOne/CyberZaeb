import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public static int[][] splitArray(int[] arr) {
        List<Integer> noSequenceList = new ArrayList<>();
        List<Integer> noRepeatedList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1] + 1) {
                noSequenceList.add(arr[i]);
            }
            if (i == 0 || arr[i] != arr[i - 1]) {
                noRepeatedList.add(arr[i]);
            }
        }
        int[][] result = new int[2][];
        result[0] = new int[noSequenceList.size()];
        result[1] = new int[noRepeatedList.size()];
        for (int i = 0; i < noSequenceList.size(); i++) {
            result[0][i] = noSequenceList.get(i);
        }
        for (int i = 0; i < noRepeatedList.size(); i++) {
            result[1][i] = noRepeatedList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 3, 4, 5};
        int[][] splitArrays = splitArray(sortedArray);
        System.out.print("Array без последовательности: ");
        for (int num : splitArrays[0]) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Array без повторяющихся элементов: ");
        for (int num : splitArrays[1]) {
            System.out.print(num + " ");
        }
    }
}
