package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class GeneratePowerSet {

    public List<List<Integer>> generatePowerSet(List<Integer> input) {
        List<List<Integer>> powerSet = new ArrayList<>();
        directedPowerSet(input, 0, new ArrayList<>(), powerSet);
        return powerSet;
    }

    private void directedPowerSet(List<Integer> input, int toBeSelected,
                                  ArrayList<Integer> selectedSetSoFar,
                                  List<List<Integer>> powerSet) {
        if (toBeSelected == input.size()) {
            powerSet.add(new ArrayList<>(selectedSetSoFar));
            return;
        }
        selectedSetSoFar.add(input.get(toBeSelected));
        directedPowerSet(input, toBeSelected + 1, selectedSetSoFar, powerSet);
        selectedSetSoFar.remove(selectedSetSoFar.size() - 1);
        directedPowerSet(input, toBeSelected + 1, selectedSetSoFar, powerSet);
    }
}
