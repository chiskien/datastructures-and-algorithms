package chiskien.datastructures_algorithms.stack;

import java.util.ArrayList;
import java.util.List;

//Recursion, Stack
public class GenerateParentheses {

    //Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        System.out.println(generateParentheses.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int numPairs) {
        List<String> result = new ArrayList<>();
        directedGenerateBalancedParenthesis(numPairs, numPairs, "", result);
        return result;
    }

    private void directedGenerateBalancedParenthesis(int numLeftParensNeeded,
                                                     int numRightParensNeeded,
                                                     String validPrefix,
                                                     List<String> result) {
        if (numLeftParensNeeded == 0 && numRightParensNeeded == 0) {
            result.add(validPrefix);
            return;
        }
        if (numLeftParensNeeded > 0) {
            directedGenerateBalancedParenthesis(
                    numLeftParensNeeded - 1,
                    numRightParensNeeded,
                    validPrefix + "(",
                    result);
        }
        if (numLeftParensNeeded < numRightParensNeeded) {
            directedGenerateBalancedParenthesis(
                    numLeftParensNeeded,
                    numRightParensNeeded - 1,
                    validPrefix + ")",
                    result
            );
        }
    }
}
