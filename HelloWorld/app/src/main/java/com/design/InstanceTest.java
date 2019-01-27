package com.design;

public class InstanceTest {

    // 私有构造
    private InstanceTest(){

    }

    // 饿汉式
    private static InstanceTest instance = new InstanceTest();

    // 公有静态方法
    public static InstanceTest getInstance(){
        return instance;
    }

}
