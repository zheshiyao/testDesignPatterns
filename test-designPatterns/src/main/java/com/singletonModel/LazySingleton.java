package com.singletonModel;

/**
 * 单例模式---懒汉式
 * Created by xuesj on 2018/2/24.
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getLazySingleton() {
        //此处可能会产生线程安全问题
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
