package chiskien.datastructures_algorithms.binarytree;

public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q && p == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}
