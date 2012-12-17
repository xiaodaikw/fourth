package test;

import main.Parking;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-11
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
public class ParkingTest {
     Parking p=new Parking();
    @Test
    public void should_output_one_status(){
        Assert.assertEquals("目前还有1个停车位",p.should_output_pull("京A1234"));
    }
    @Test
    public void should_output_no_status() {

        Assert.assertEquals("目前没有停车位",p.should_output_pull("京A1234"));
    }
}
