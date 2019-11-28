package com.lxd.javabasestudy.characteristic.java_abstract;

/**
 * @author Asura
 * @Description
 * @Date 2019/11/28 21:19
 */
abstract class AbstractPeople {
    String name = "dasdasd";
  private   String name2;

    abstract void eat();

    //抽象方法不能被private修饰，就是为了让人重写的
//    private abstract void die();

    String getName() {
        return this.name;
    }
}
