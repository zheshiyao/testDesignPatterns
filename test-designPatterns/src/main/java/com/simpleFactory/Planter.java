package com.simpleFactory;

/**
 * Created by xuesj on 2018/2/9.
 * 生产者
 */
public class Planter {
    /**
     * 这里有个问题，就是如果种类非常多时，需要提供很多判断语句，不够简洁，可以通过反射进行优化
     * 提供水果，根据消费者的需要提供
     * @param fruitName
     */
    public Fruit plant(String fruitName){

        if ("apple".equals(fruitName)){
            return new Apple();
        }else if ("grape".equals(fruitName)){
            return new Grape();
        }
        return null;
    }

    /**
     * 优化后的生产,通过路径反射，获取产品
     * @param fruitPath
     * @return
     */
    public Fruit newPlant(String fruitPath) throws Exception {
        Class<?> c = Class.forName(fruitPath);
        return (Fruit)c.newInstance();

    }

}
