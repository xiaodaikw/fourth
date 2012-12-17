package main;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-1
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class StackMain {
    LinkedList list;
    public String outputnumber(char[] servername) {
        String number = "";
        for(int i=servername.length-1;i>=0;i--){
            number+= String.valueOf(servername[i]);
        }
        return number;  //To change body of created methods use File | Settings | File Templates.
    }

    public String outputempty(char[] servername) {
        String status ="";
        if(servername.length==0){
            status="empty";
        }
        if(servername.length==4){
            status="full";
        }
        return status;  //To change body of created methods use File | Settings | File Templates.
    }


    public void push(Object o) {
        list=new LinkedList();
        list.add(o);
    }

    public Object getTop() {
        if(list.size()!=0){
            return list.getLast();
        } else{
            return  null;
        }
    }

    public Object pop() {
        Object object=list.getFirst();
        if(list.size()==0){
            return null;
        }
        list.removeFirst();
        return object;  //To change body of created methods use File | Settings | File Templates.
    }
}
