package main;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-11-11
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
public class Car {


    private int count;
    private String license;
    Car[] car=new Car[count];


    public Car(String license) {
        this.license = license;
    }
   public Car(){
       super();
   }



    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        return count;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


}
