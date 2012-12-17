package main;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-11
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
public class Parking {
     //ArrayList list=new ArrayList();
        Car car=new Car();
    String license[]=new String[20];
    static int number=19;
    public String should_output_pull(String license){
        car.setCount(number);
        if(car.getCount()>=20){
           return "目前没有停车位";
        } else{
            return "目前还有"+String.valueOf(20-number)+"个停车位";
        }

    }
   public String should_output_add_car(String license){
       car.setCount(number);
       for(int i=0;i<license .length();i++){
           license[i]=license;
           return
       }

   }

}

