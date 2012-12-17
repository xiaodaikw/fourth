package test;

import main.StackMain;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-1
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {
    //测试堆栈是否是先进后出。
    @Test
    public void should_output_right(){
        StackMain stack=new StackMain();
        char[] servername={'a','b','c','d'};
        Assert .assertEquals("dcba",stack.outputnumber(servername ));
    }
        //测试堆栈是否为空
        @Test
    public void should_output_empty() {
            StackMain stack=new StackMain();
            char[] servername={};
            Assert.assertEquals("empty",stack.outputempty(servername));
        }
    //测试堆栈是否为满
    @Test
    public void should_output_full(){
        StackMain stack=new StackMain();
        char[] servername={'a','b','c','d'} ;
        Assert.assertEquals("full",stack.outputempty(servername));
    }
    //测试堆栈的压入
    @Test
    public  void should_output_top_value(){
        StackMain stack=new StackMain();
        stack.push("ok");
        Assert.assertEquals("ok",stack.getTop());
    }
    //测试堆栈的出栈
    @Test
    public void should_output_top_values(){
        StackMain stack=new StackMain();
        stack.push("hello");
        stack.push("world");
        Assert .assertEquals("world",stack.pop());
    }


}
