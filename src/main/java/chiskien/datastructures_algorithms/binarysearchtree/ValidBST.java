package chiskien.datastructures_algorithms.binarysearchtree;

import chiskien.datastructures_algorithms.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidBST {


    public boolean isValidBST(TreeNode root) {
        Deque<QueueEntry> BFSQueue = new LinkedList<>();
        BFSQueue.add(new QueueEntry(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        QueueEntry headEntry;
        while ((headEntry = BFSQueue.poll()) != null) {
            if (headEntry.root != null) {
                if (headEntry.root.val < headEntry.lowerBound ||
                        headEntry.root.val > headEntry.higherBound) {
                    return false;
                }

                BFSQueue.addLast(new QueueEntry(headEntry.root.left, headEntry.lowerBound,
                        headEntry.root.val));
                BFSQueue.addLast(new QueueEntry(headEntry.root.right, headEntry.root.val,
                        headEntry.higherBound));
            }
        }
        return true;
    }
}
 class QueueEntry {
    public TreeNode root;
    public Integer lowerBound, higherBound;

    public QueueEntry(TreeNode root, Integer lowerBound, Integer higherBound) {
        this.root = root;
        this.lowerBound = lowerBound;
        this.higherBound = higherBound;
    }
}
