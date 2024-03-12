package chiskien.datastructures_algorithms.binarytree;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lcahelper(root, p, q).ancestor;
    }

    //returns an object consisting of an int and a node.
    //the int field is 0,1,2 depending on how many of {p, q} are present in tree
    //when ancestor is assigned to a non-null value, it is the LCA
    private Status lcahelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return new Status(0, null);
        }
        Status leftResult = lcahelper(root.left, p, q);
        if (leftResult.numTargetNodes == 2) {
            return leftResult;
        }
        Status rightResult = lcahelper(root.right, p, q);
        if (rightResult.numTargetNodes == 2) {
            return rightResult;
        }
        int numTargetNodes = leftResult.numTargetNodes + rightResult.numTargetNodes +
                (root == p ? 1 : 0) + (root == q ? 1 : 0);
        return new Status(numTargetNodes, numTargetNodes == 2 ? root : null);
    }

    /*
     * @code Status
     * */
    private record Status(int numTargetNodes, TreeNode ancestor) {
    }
}
