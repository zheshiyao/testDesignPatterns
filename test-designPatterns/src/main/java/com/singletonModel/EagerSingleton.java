package com.singletonModel;

/**
 * 单例模式---饿汉式
 * Created by xuesj on 2018/2/24.
 */
public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();   //不管是否使用，直接建立类的实例

    private EagerSingleton(){}

    public static EagerSingleton getEagerSingleton() {    //线程安全的方式
        return eagerSingleton;
    }
}
