package chiskien.datastructures_algorithms.binarytree;

public class ConstructStringFromBinaryTree {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(tree2str(root));
    }

    public static String tree2str(TreeNode root) {
        StringBuilder stringBuilder1 = new StringBuilder();
        dfs(root, stringBuilder1);
        return stringBuilder1.toString();
    }

    public static String preOrderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null || root.right != null) {
                stringBuilder.append(root.val).append("(");
            } else {
                stringBuilder.append(root.val);
            }
            if (root.left == null && root.right != null) {
                stringBuilder.append(")(");
            }
            preOrderTraversal(root.left);
            if (root.left != null && root.right != null) {
                stringBuilder.append("(");
            }
            preOrderTraversal(root.right);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    public static void dfs(TreeNode t, StringBuilder res) {
        if (t == null) return;
        res.append(t.val);
        if (t.left == null && t.right == null) return;
        res.append("(");
        dfs(t.left, res);
        res.append(")");
        if (t.right != null) {
            res.append("(");
            dfs(t.right, res);
            res.append(")");
        }
    }
}
