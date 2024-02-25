package chiskien.datastructures_algorithms.array;

public class WinnerOfArrayGame {

    public int getWinner(int[] arr, int k) {
        int currentWinner = arr[0];
        int consecutiveWins = 0;
        int index = 1;

        while (consecutiveWins < k) {
            if (arr[index] > currentWinner) {
                currentWinner = arr[index];
                consecutiveWins = 1;
            } else {
                consecutiveWins++;
            }

            if (consecutiveWins == k) {
                break;
            }

            // Move the smaller integer to the end
            int temp = arr[index];
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;

            // Update the index for the next round
        }

        return currentWinner;
    }
}
