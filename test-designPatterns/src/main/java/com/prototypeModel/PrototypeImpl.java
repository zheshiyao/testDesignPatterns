package com.prototypeModel;

import java.util.Date;

/**
 * Created by xuesj on 2018/2/26.
 */
public class PrototypeImpl extends AbstractPrototype {
    @Override
    public void show() {
        System.out.println("prototype showing "+ (new Date()));
    }
}
