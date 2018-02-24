package com.simpleFactory;

/**
 * Created by xuesj on 2018/2/9.
 * 消费者
 */
public class Consumer {

//    //优化前的消费者
//    public static void main(String arg[]){
//        //获取生产者
//        Planter planter = new Planter();
//        //通过生产者获取相应的功能
//        Fruit fruit = planter.plant("apple");
//        fruit.plant();
//        fruit.plant();
//        fruit.harvest();
//    }


    private static final String apple = "com.simpleFactory.Apple";
    private static final String Grape = "com.simpleFactory.Grape";
    //优化后
    public static void main(String arg[]) throws Exception{
        //获取生产者
        Planter planter = new Planter();
        //通过生产者获取相应的功能
        Fruit fruit0 = planter.newPlant(apple);
        Fruit fruit1 = planter.newPlant(Grape);
        fruit0.plant();
        fruit1.plant();
    }
}
