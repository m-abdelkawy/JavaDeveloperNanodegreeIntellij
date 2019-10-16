import java.util.*;

public class TopKLargerNumber {
    public static TreeSet<Integer> topKLargerNumber(int[] arr, int k){

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : arr) {
            treeSet.add(num);
            if(treeSet.size() > k){
                treeSet.pollFirst();
            }
        }
        return treeSet;
    }

    public static void displayTreeSet(TreeSet<Integer> treeSet){
        for (int num : treeSet) {
            System.out.println(num);
        }
    }
}
