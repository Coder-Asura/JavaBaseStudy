package com.lxd.javabasestudy.characteristic.java_interface;

/**
 * @author Asura
 * @Description
 * @Date 2019/11/28 21:25
 */
public interface ILife extends IStudy {
    static void hehe() {
        //接口中定义的变量默认都是final修饰的，不能修改,也可以被static修饰
//        name="dasdas";
        System.out.println(name + ": hehe");
    }

    void sleep();

    //不能有非静态的方法实现
//    void hehe2(){
//
//    }
}
