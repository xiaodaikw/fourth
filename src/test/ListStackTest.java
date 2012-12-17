package test;

import main.ListStackMain;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-3
 * Time: 上午9:29
 * To change this template use File | Settings | File Templates.
 */
public class ListStackTest {

     //测试先进后出的顺序
    @Test
    public void should_output_from_tail_to_head(){
        ListStackMain mains=new ListStackMain();
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add("world");
        Assert.assertEquals("worldhello",mains.output(list));
    }
    //测试栈是否为空
    @Test
    public void should_output_empty(){
        ListStackMain mains=new ListStackMain();
        Assert.assertEquals("empty",mains.stacklength());
    }
}
