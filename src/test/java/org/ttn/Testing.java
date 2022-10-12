package org.ttn;
import org.junit.Test;
import org.junit.Assert;
public class Testing {
   @Test
    public void check(){
       Assert.assertEquals(6,org.ttn.Main.mul(2,3));
   }

}
