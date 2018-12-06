package top.iyuhp.pipelinedemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dylan
 * @since 2018/12/6
 */
public class HelloTest {

    @Before
    public void Before() {
        System.out.println(">>> before <<<");
    }

    @Test
    public void TestSuccess() {
        System.out.println(">>> success <<<");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void TestFailed() {
        System.out.println(">>> failed <<<");
        Assert.assertEquals(1, 2);
    }

    @Test
    public void TestError() {
        System.out.println(">>> error <<<");
        throw new NullPointerException("am i a npe ?");
    }

}
