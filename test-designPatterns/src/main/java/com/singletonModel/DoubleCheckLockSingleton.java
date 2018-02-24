package com.singletonModel;

/**
 * 单例模式--双检锁模式(对懒汉模式进行优化)
 * Created by xuesj on 2018/2/24.
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton doubleCheckLockSingleton = null;
    private DoubleCheckLockSingleton(){

    }

    public static DoubleCheckLockSingleton getDoubleCheckLockSingleton() {
        if (doubleCheckLockSingleton==null){
            synchronized(DoubleCheckLockSingleton.class){
                //关键点在于进行两次空判断，此处主要为了线程B等待解锁后继续执行到此处，判断A是否建了实例，如果建了就不继续执行了
                if (doubleCheckLockSingleton == null){
                    doubleCheckLockSingleton = new DoubleCheckLockSingleton();
                }

            }
        }
        return doubleCheckLockSingleton;
    }
}
