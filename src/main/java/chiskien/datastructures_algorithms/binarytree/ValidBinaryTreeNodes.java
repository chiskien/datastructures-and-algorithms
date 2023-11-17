package chiskien.datastructures_algorithms.binarytree;

public class ValidBinaryTreeNodes {


    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        for (int i = 0; i < n -1; i++) {
             if (leftChild[i] == i- 1)return false;

        }
        return false;
    }
}
