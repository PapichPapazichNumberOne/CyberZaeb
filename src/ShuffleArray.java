import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] sortedArray = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        do {
            unsortArray(sortedArray);

            for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i] + " ");
            }
            System.out.println();

        } while (hasRepeatedNumbers(sortedArray));
    }

    private static boolean hasRepeatedNumbers(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] == sortedArray[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void unsortArray(int[] sortedArray) {
        int n = sortedArray.length;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(n);
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[randomIndex];
            sortedArray[randomIndex] = temp;
        }
    }
}