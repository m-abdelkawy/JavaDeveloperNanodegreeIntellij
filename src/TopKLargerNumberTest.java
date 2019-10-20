import org.junit.Assert;

import java.util.List;
import java.util.TreeSet;

public class TopKLargerNumberTest {
    @org.junit.Test
    public void topKLargerNumberTest1() throws Exception{
        int[] arr = {5,7,9,8,6,4};
        TreeSet<Integer> treeSetActual = TopKLargerNumber.topKLargerNumber(arr, 3);

        List<Integer> lstRes = List.of(9,7,8);
        TreeSet<Integer> treeSetExpected = new TreeSet(lstRes);

        Assert.assertEquals(treeSetExpected, treeSetActual);
    }

    @org.junit.Test
    public void topKLargerNumberTest2() throws Exception{
        int[] arr = {99,55,22,77,66,11,44,33,88};
        TreeSet<Integer> treeSetActual = TopKLargerNumber.topKLargerNumber(arr, 2);

        List<Integer> lstRes = List.of(88,99);
        TreeSet<Integer> treeSetExpected = new TreeSet<>(lstRes);

        Assert.assertEquals(treeSetExpected, treeSetActual);
    }
}
