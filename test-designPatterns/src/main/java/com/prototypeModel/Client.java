package com.prototypeModel;

/**
 * 原型模式客户端
 * Created by xuesj on 2018/2/26.
 */
public class Client {
    public static void main(String arg[]){
        AbstractPrototype prototype = new PrototypeImpl();
        prototype.show();
        for (int i = 0;i < 10; i++){
            AbstractPrototype prototypeCoustmer = prototype.clone();   //克隆
            prototypeCoustmer.show();
        }
    }
}
