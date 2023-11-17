package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SideViewTree {


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode rightMost = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.removeFirst();
                if (n != null) {
                    rightMost = n;
                    queue.addLast(n.left);
                    queue.addLast(n.right);
                }
            }
            if (rightMost != null) {
                result.add(rightMost.val);
            }
        }

        return result;
    }
}
