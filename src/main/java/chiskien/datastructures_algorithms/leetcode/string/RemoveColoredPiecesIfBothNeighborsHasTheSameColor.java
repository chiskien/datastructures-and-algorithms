package chiskien.datastructures_algorithms.leetcode.string;

public class RemoveColoredPiecesIfBothNeighborsHasTheSameColor {


    public boolean winnerOfGame(String colors) {
        //remove a piece whenever both of its neighbors are the same value
        //return true if A win otherwise B
        // colors consist only letter 'A' and 'B'

        if (colors.length() <= 2) return false;
        int aCount = 0, bCount = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1) &&
                    colors.charAt(i) == colors.charAt(i + 1)) {
                if (colors.charAt(i) == 'A') {
                    aCount++;
                } else {
                    bCount++;
                }
            }
        }

        return aCount > bCount;
    }
}
