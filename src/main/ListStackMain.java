package main;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-3
 * Time: 上午9:29
 * To change this template use File | Settings | File Templates.
 */
public class ListStackMain {
    ArrayList list;
    public String stacklength(){
        if(list.size()==0){
            return "empty";
        } else{
            return "error";
        }
    }


    public void push(Object o) {
        list=new ArrayList();
        list.add(o);
    }

    public String output(ArrayList list) {
          String values = "";
        for(int i=list.size()-1;i>=0;i--){
             values+=String.valueOf( list.get(i)) ;
        }
        return values;
    }
}
