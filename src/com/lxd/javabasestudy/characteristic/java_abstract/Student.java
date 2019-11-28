package com.lxd.javabasestudy.characteristic.java_abstract;

/**
 * @author Asura
 * @Description
 * @Date 2019/11/28 21:20
 */
public class Student extends AbstractPeople {
    @Override
    void eat() {

    }

    private void speak() {
        System.out.println("I'm" + getName());
        System.out.println("I'm" + name);
//        System.out.println("I'm" + name2);
    }
}
