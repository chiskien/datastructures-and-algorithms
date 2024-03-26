package chiskien.datastructures_algorithms.hashmap;

import java.util.*;

public class SmallestSubArraySequentiallyCoveringAllValues {
    public static void main(String[] args) {
        SmallestSubArraySequentiallyCoveringAllValues sa = new SmallestSubArraySequentiallyCoveringAllValues();
        List<String> paragraph = List.of("mot", "con", "vit", "xoe");
        List<String> keywords = List.of("con", "xoe");
        System.out.println(Arrays.toString(sa.findSmallestSequentiallyCoveringSubArray(paragraph, keywords)));
    }

    public int[] findSmallestSequentiallyCoveringSubArray(List<String> paragraph,
                                                          List<String> keywords) {
        //Map string to its indexes
        Map<String, Integer> keywordToIndex = new HashMap<>();
        List<Integer> latestOccurrence = new ArrayList<>(keywords.size());
        //for each keyword (identified by its index in keyword)
        List<Integer> shortestSubArrayLength = new ArrayList<>(keywords.size());
        for (int i = 0; i < keywords.size(); i++) {
            latestOccurrence.add(-1);
            shortestSubArrayLength.add(Integer.MAX_VALUE);
            keywordToIndex.put(keywords.get(i), i);
        }
        int shortestDistance = Integer.MAX_VALUE;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        for (int i = 0; i < paragraph.size(); i++) {
            Integer keywordIndex = keywordToIndex.get(paragraph.get(i));
            if (keywordIndex != null) {
                if (keywordIndex == 0) {
                    shortestSubArrayLength.set(0, 1);
                } else if ((shortestSubArrayLength.get(keywordIndex - 1)) != Integer.MAX_VALUE) {
                    int distanceToPreviousKeyword = i - latestOccurrence.get(keywordIndex - 1);
                    int i1 = distanceToPreviousKeyword + shortestSubArrayLength.get(keywordIndex - 1);
                    shortestSubArrayLength.set(keywordIndex, i1);
                }
                latestOccurrence.set(keywordIndex, i);

                if (keywordIndex == keywords.size() - 1 && shortestSubArrayLength.getLast() < shortestDistance) {
                    shortestDistance = shortestSubArrayLength.getLast();
                    result[0] = i - shortestSubArrayLength.getLast();
                    result[1] = i;
                }
            }
        }

        return result;
    }


}
