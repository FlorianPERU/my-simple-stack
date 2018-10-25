package deqo.fper.MySimpleStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Test
    public void getValue() {
        Object object = new Object();

        Item item = new Item(object);
        Assert.assertEquals(object,item.getValue());

    }

    @Test
    public void setValue() {
        Object object = new Object();
        Item item = new Item(object);
        Object object2 = new Object();
        Item item2 = new Item(object2);

        item2.setValue(object);
        Assert.assertEquals(item.getValue(),item2.getValue());

    }


}