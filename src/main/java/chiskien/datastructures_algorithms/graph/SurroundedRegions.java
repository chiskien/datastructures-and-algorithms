package chiskien.datastructures_algorithms.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SurroundedRegions {


    //
    public void fillSurroundedRegions(List<List<Character>> board) {
        if (board.isEmpty()) {
            return;
        }
        List<List<Boolean>> visited = new ArrayList<>(board.size());
        for (List<Character> characters : board) {
            visited.add(
                    new ArrayList<>(Collections.nCopies(characters.size(), false))
            );
        }
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).get(0) == 'W' && !visited.get(i).get(0)) {
                markBoundaryRegion(i, 0,board, visited);
            }
            
        }
    }

    private void markBoundaryRegion(int i, int i1, List<List<Character>> board, List<List<Boolean>> visited) {
    }
}
