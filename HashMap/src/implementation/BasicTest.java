package implementation;

import org.junit.Assert;
import org.junit.Before;

import java.util.HashMap;

public class BasicTest {

    public Basic basic = new Basic();

    @org.junit.Test
    public void giveCharacter() {
        Assert.assertEquals(2,basic.giveCharacter("RichR","R"));
    }
}
