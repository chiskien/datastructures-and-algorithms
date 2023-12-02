package chiskien.datastructures_algorithms.recursion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TowerOfHanoi {
    private static final int NUM_PEGS = 3;

    public void computeTowerOfHanoi(int numRings) {
        List<Deque<Integer>> pegs = new ArrayList<>();
        for (int i = 0; i < NUM_PEGS; i++) {
            pegs.add(new LinkedList<>()); //Stack 3 of rings in 3 pegs
        }
        for (int i = numRings; i >= 1; i--) {
            pegs.get(0).addFirst(i); //adding rings to first pegs
        }
        computeTowerOfHanoiSteps(numRings, pegs, 0, 1, 2);
    }

    private void computeTowerOfHanoiSteps(int numRingsToMove,
                                          List<Deque<Integer>> pegs,
                                          int fromPeg, int toPeg, int usePeg) {
        if (numRingsToMove > 0) {
            computeTowerOfHanoiSteps(numRingsToMove - 1, pegs, fromPeg, usePeg, toPeg);
            pegs.get(toPeg).addFirst(pegs.get(fromPeg).removeFirst());
            System.out.println("Move from peg " + fromPeg + " to peg " + toPeg);
            computeTowerOfHanoiSteps(numRingsToMove - 1, pegs, usePeg, toPeg, fromPeg);
        }
    }
}
