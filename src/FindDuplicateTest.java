import org.junit.Assert;

public class FindDuplicateTest {
    @org.junit.Test
    public void findDuplicateTest1() throws Exception{
        int output = FindDuplicate.findDuplicate("abcabc");
        int expected = 3;
        Assert.assertEquals(expected, output);
    }

    @org.junit.Test
    public void findDuplicateTest2() throws Exception{
        int output = FindDuplicate.findDuplicate("mohammed");
        int expected = 4;
        Assert.assertEquals(expected, output);
    }
}
