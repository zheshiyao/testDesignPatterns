package com.prototypeModel;

/**
 * 原型模式的抽象原型角色
 * Created by xuesj on 2018/2/26.
 */
public abstract class AbstractPrototype implements Cloneable{
    @Override
    protected AbstractPrototype clone(){
        AbstractPrototype prototype = null;
        try{
            prototype = (AbstractPrototype)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }

    public abstract void show();
}
