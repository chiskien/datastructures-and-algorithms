package chiskien.datastructures_algorithms.binarytree;

public class LowestCommonAncestorWithParentPointer {


    public TreeNode findLCA(TreeNode root, TreeNode node0, TreeNode node1) {
        int depth0 = TreeNode.getDepth(node0);
        int depth1 = TreeNode.getDepth(node1);

        //Mark node0 as the larger to simplify code
        if (depth1 > depth0) {
            TreeNode temp = node0;
            node0 = node1;
            node1 = temp;
        }
        //Ascends from the deeper node
        int depthDiff = Math.abs(depth0 - depth1);
        while (depthDiff-- > 0) {
            node0 = node0.parent;
        }
        //now ascends both nodes until reaching the LCA
        while (node0 != node1) {
            node1 = node1.parent;
            node0 = node0.parent;
        }
        return node0;
    }
}
