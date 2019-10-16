import org.junit.Assert;

public class TwoSumTest {
    @org.junit.Test
    public void twoSumTest1() throws Exception{
        int[] arr = new int[] {1,2,3,4};
        boolean actual = TwoSum.twoSun(arr, 5);
        Assert.assertEquals(true, actual);
    }

    @org.junit.Test
    public void twoSumTest2() throws Exception{
        int[] arr = new int[] {1,4,5,1,6};
        boolean actual = TwoSum.twoSun(arr, 12);
        Assert.assertEquals(false, actual);
    }
}
