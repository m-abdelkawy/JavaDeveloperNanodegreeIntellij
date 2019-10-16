import org.junit.Assert;

public class StringReverseTest {
    @org.junit.Test
    public void stringReverseTest1() throws Exception{
        String actual = StringReverse.stringReverse("abcd");
        String expected = "dcba";

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void stringReverseTest2() throws Exception{
        Assert.assertEquals("yob doog", StringReverse.stringReverse("good boy"));
    }

    @org.junit.Test
    public void stringReverseTest3() throws Exception{
        Assert.assertEquals("ahahah", StringReverse.stringReverse("hahaha"));
    }
}
