package com.design;

public class InstanceTwo {

    public InstanceTwo(){

    }

    // 懒汉式
    private static InstanceTwo instance = null;

    // 创建开放的静态方法提供实例对象
    public static InstanceTwo getInstance(){
        if(instance == null)
            instance = new InstanceTwo();

        return instance;
    }

}
